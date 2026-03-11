import React, { useEffect, useState } from 'react'
import styles from './RegCar.module.css'
import { getCars, regCar } from '../api/carApi'
import { useNavigate } from 'react-router-dom'
import Button from '../components/common/Button'
import Input from '../components/common/Input'
import Select from '../components/common/Select'
import ListTable from '../components/common/ListTable'

const RegCar = () => {
  const nav = useNavigate();
  // 등록할 차량 정보 저장 state변수
  const [carInfo, setCarInfo] = useState({
    modelName : '',
    price : 0,
    manufacturer : 'select'
  })
  
  // 등록된 차량 저장 state변수
  const [cars, setCars] = useState([])

  // 등록된 차랑 조회 함수
  const getCarList = async () => {
    const response = await getCars()
    setCars(response.data)
  }

  // 마운트 시 실행할 함수
  useEffect(()=>{getCarList()}, [])


  //데이터 변경 시 저장 함수
  const handleData = e => {
    if(e.target.name === 'price'){
      e.target.value = e.target.value.replace(/[^0-9]/g, "")
    }
    setCarInfo(prev => ({
      ...prev,
      [e.target.name] : e.target.value
    }))
  }

  //유효성 검사 결과 저장 state변수
  const [errors, setErrors] = useState({
    modelName : '',
    price : '',
    manufacturer : ''
  })

  //유효성 검사 함수
  const validateField = () => {
    const newErrors = {
      modelName : '',
      price : '',
      manufacturer : ''
    }
    let isValid = true;
    if(carInfo.modelName === ''){
      newErrors.modelName = '필수 선택입니다.'
      isValid = false;
    }
    if(carInfo.price === 0){
      newErrors.price = '필수 입력입니다.'
      isValid = false;
    }
    if(carInfo.manufacturer === 'select'){
      newErrors.manufacturer = '필수 입력입니다.'
      isValid = false;
    }
    setErrors(newErrors);
    return isValid;
  }
  
  //등록 버튼 클릭 시 실행 함수
  const clickReg = async () => {
    const isValid = validateField();
    if(!isValid){
      return;
    }
    const response = await regCar(carInfo)
    if(response.status === 201){
      alert('차량 등록이 완료되었습니다.')
      nav(0)
    }
  }

  return (
    <div className={styles.container}>
      <div>
        <h2>차량등록</h2>
        <div className={styles.reg_car}>
          <div>
            <div>
              <p>제조사</p>
              <Select 
                name="manufacturer" 
                value={carInfo.manufacturer}
                onChange={e => handleData(e)}
              >
                <option value="select">선택</option>
                <option value="kia">KIA</option>
                <option value="hyundae">HYUNDAE</option>
              </Select>
            </div>
            <div>{errors.manufacturer && <p className='error'>{errors.manufacturer}</p>}</div>
          </div>
          <div>
            <div>
              <p>모델명</p>
              <Input 
                type="text" 
                name='modelName'
                value={carInfo.modelName}
                onChange={e => handleData(e)}
              />
            </div>
            {errors.modelName && <p className='error'>{errors.modelName}</p>}
          </div>
          <div>
            <div>
              <p>차량가격</p>
              <Input 
                type="text" 
                name='price'
                value={carInfo.price}
                onChange={e => handleData(e)}
              />
            </div>
            {errors.price && <p className='error'>{errors.price}</p>}
          </div>
        </div>
      </div>
      <div className={styles.btn_div}>
        <Button
          onClick={e => clickReg()}
          title='등록'
        />
      </div>
      <hr />
      <div>
        <h2>등록된 차량 목록</h2>
      </div>
      <div>
        <ListTable>
          <thead>
            <tr>
              <td>No</td>
              <td>모델번호</td>
              <td>모델명</td>
              <td>제조사</td>
            </tr>
          </thead>
          <tbody>
            {
              cars.map((data, i)=>{return(
                <tr key={i}>
                  <td>{cars.length - i}</td>
                  <td>{data.modelNo}</td>
                  <td>{data.modelName}</td>
                  <td>{data.manufacturer}</td>
                </tr>
              )})
            }
          </tbody>
        </ListTable>
      </div>
    </div>
  )
}

export default RegCar