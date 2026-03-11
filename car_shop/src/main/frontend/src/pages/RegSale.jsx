import React, { useEffect, useState } from 'react'
import styles from './RegSale.module.css'
import Button from '../components/common/Button'
import Input from '../components/common/Input'
import Select from '../components/common/Select'
import { useNavigate } from 'react-router-dom'
import { getCars } from '../api/carApi'
import { regSale } from '../api/saleApi'

const RegSale = () => {
  const nav = useNavigate();

  //등록할 판매정보 저장 state변수
  const [saleInfo, setSaleInfo] = useState({
    buyerName : '',
    buyerPhone : '',
    color : 'select',
    modelNo : 'select'
  })

  //조회한 차량 리스트 저장 state변수
  const [cars, setCars] = useState([])

  //유효성 검사 결과 저장 state변수
  const [errors, setErrors] = useState({
    buyerName : '',
    buyerPhone : '',
    color : '',
    modelNo : ''
  })
  
  //유효성 검사 함수
  const validateField = () => {
    const newErrors = {
      buyerName : '',
      buyerPhone : '',
      color : '',
      modelNo : ''
    }
    let isValid = true;
    const phoneRegex = /^010-\d{4}-\d{4}$/;
    if(saleInfo.buyerPhone !== '' && !phoneRegex.test(saleInfo.buyerPhone)){
      newErrors.buyerPhone = '010-0000-0000 형식으로 입력해주세요.'
      isValid = false;
    }
    if(saleInfo.buyerName === ''){
      newErrors.buyerName = '필수 입력입니다.'
      isValid = false;
    }
    if(saleInfo.color === 'select'){
      newErrors.color = '필수 선택입니다.'
      isValid = false;
    }
    if(saleInfo.modelNo === 'select'){
      newErrors.modelNo = '필수 선택입니다.'
      isValid = false;
    }
    setErrors(newErrors);
    return isValid;
  }

  // 등록된 차랑 조회 함수
  const getCarList = async () => {
    const response = await getCars()
    setCars(response.data)
  }

  // 마운트 시 실행할 함수
  useEffect(()=>{getCarList()}, [])

  //데이터 변경 시 저장 함수
  const handleData = e => {
    if(e.target.name === 'buyerPhone'){
      e.target.value = e.target.value.replace(/[^0-9-]/g, "")
    }
    setSaleInfo(prev => ({
      ...prev,
      [e.target.name] : e.target.value
    }))
  }

  //등록 버튼 클릭시
  const clickReg = async () => {
    const isValid = validateField();
    if(!isValid){
      return;
    }
    const response = await regSale(saleInfo)
    if(response.status === 201){
      alert('판매 등록이 완료되었습니다.')
      nav(0)
    }
  }  

  return (
    <div className={styles.container}>
      <h2>판매정보등록</h2>
      <div>
        <p>구매자명</p>
        <div>
          <Input 
            type = "text" 
            name = 'buyerName'
            value = {saleInfo.buyerName}
            onChange = {e => handleData(e)}  
          />
          <div>{errors.buyerName && <p className='error'>{errors.buyerName}</p>}</div>
        </div>
      </div>
      <div className={styles.color_model}>
        <div>
          <p>색상</p>
          <div>
            <Select
              name = 'color'
              value = {saleInfo.color}
              onChange = {e => handleData(e)}  
            >
              <option value='select'>선택</option>
              <option value='black'>black</option>
              <option value='white'>white</option>
              <option value='red'>red</option>
            </Select>
            <div>{errors.color && <p className='error'>{errors.color}</p>}</div>
          </div>
        </div>
        <div>
          <p>모델</p>
          <div>
            <Select
              name = 'modelNo'
              value = {saleInfo.modelNo}
              onChange = {e => handleData(e)} 
            >
              <option value='select'>선택</option>
              {
                cars.map((data, i) => {return(
                  <option value={data.modelNo} key={i}>{data.modelName}</option>
                )})
              }
            </Select>
            <div>{errors.modelNo && <p className='error'>{errors.modelNo}</p>}</div>
          </div>
        </div>
      </div>
      <div>
        <p>연락처</p>
        <div>
          <Input 
            type="text" 
            placeholder='000-1111-2222 형태로 입력'
            name = 'buyerPhone'
            value = {saleInfo.buyerPhone}
            onChange = {e => handleData(e)}
          />
          <div>{errors.buyerPhone && <p className={styles.phone_error}>{errors.buyerPhone}</p>}</div>
        </div>
      </div>
      <div className={styles.btn_div}>
        <Button
          title='등록'
          onClick={e => clickReg()}
        />
      </div>
    </div>
  )
}

export default RegSale