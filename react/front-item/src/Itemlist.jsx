import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Itemlist = () => {
  //조회한 상품목록 데이터를 저장할 state 변수
  const [ItemList, setItemList] = useState([])

  //마운트되면 spring에서 상품목록을 조회 후 데이터를 가져온다
  useEffect(() => {
    axios.get('http://localhost:8080/items')
    .then(response => {
      console.log(response.data);
      setItemList(response.data);
    })
    .catch(e => console.log(e))
  }, []);

  return (
    <>
      <h2>상품 목록</h2>

      <table>
        <thead>
          <tr>
            <td>상품번호</td>
            <td>상품명</td>
            <td>가격</td>
            <td>등록일</td>
          </tr>
        </thead>
        <tbody>
          
        </tbody>
      </table>
    </>
  )
}

export default Itemlist
