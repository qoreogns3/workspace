import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ItemDetail = () => {
  //상세 정보 div 보임/숨기기 여부를 저장하는 state 변수
  const [isShow,setIsShow] = useState(false);

  //입력한 상품 번호를 저장할 state 변수
  const [itemNum,setItemNum] = useState('');

  //조회한 상품정보를 저장할 state 변수
  const [itemData,SetItemData] = useState({});

  //상품 상세 정보 조회 함수
  const getData = () => {
    axios.get(`http://localhost:8080/items/${itemNum}`)
    .then(response => {
      //자바에서 null값이 전달되면 빈문자('')로 받는다.
      console.log(response.data)
      SetItemData(response.data)
    })
    .catch(e => console.log(e))
  }

  return (
    <>
      <h2>상품 상세 조회</h2>
      <div>
        상품번호
        <input 
          type="text" 
          value={itemNum}
          onChange={e => setItemNum(e.target.value)}
        />
        <button 
          type='button'
          onClick={e => {
            setIsShow(true);
            getData();
          }}
        >조회</button>
      </div>
      {
        isShow &&
        <div style={{
        backgroundColor : 'lightgray',
        width : '300px',
        padding : '12px'
      }}>
        <p>조회한 상품정보입니다.</p>
        <p>상품번호 : {itemData.itemNum}</p>
        <p>상품명 : {itemData.itemName}</p>
        <p>가격 : {itemData.itemPrice}</p>
        <p>등록일 : {itemData.regDate}</p>
        <p>상품소개 : {itemData.itemIntro}</p>
      </div>
      }

      
    </>
  )
}
export default ItemDetail
