import React, { useEffect, useState } from 'react'
import ListTable from '../components/common/ListTable'
import { getSales } from '../api/saleApi'
import dayjs, { Dayjs } from 'dayjs'

const SaleList = () => {
  //판매 목록 저장 state 변수
  const [saleList, setSaleList] = useState([])

  //판매 목록 저장 함수
  const getSaleList = async () => {
    const response = await getSales()
    setSaleList(response.data)
  }
  const num = 300000000
  num.toLocaleString
  //마운트 시 실행 함수
  useEffect(()=>{getSaleList()}, [])

  return (
    <div>
      <ListTable>
          <thead>
            <tr>
              <td rowSpan={2} style={{verticalAlign: 'middle'}}>No</td>
              <td colSpan={4}>구매자 정보</td>
              <td colSpan={2}>차량 정보</td>
            </tr>
            <tr>
              <td>구매자명</td>
              <td>연락처</td>
              <td>구매일</td>
              <td>색상</td>
              <td>모델명</td>
              <td>가격</td>
            </tr>
          </thead>
        <tbody>
          {
            saleList.map((data, i) => {return(
              <tr key = {i}>
                <td>{saleList.length - i}</td>
                <td>{data.buyerName}</td>
                <td>{data.buyerPhone || '-'}</td>
                <td>
                  {dayjs(data.salesDate).format('YYYY.MM.DD')}
                  <br />
                  {dayjs(data.salesDate).format('hh:mm')}
                </td>
                <td>{data.color}</td>
                <td>{data.carDTO.modelName}</td>
                <td>{data.carDTO.price.toLocaleString()}원</td>
              </tr>
            )})
          }
        </tbody>
      </ListTable>
    </div>
  )
}

export default SaleList