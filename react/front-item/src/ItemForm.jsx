import axios from 'axios';
import React, { useState } from 'react'

const ItemForm = () => {
  //입력한 데이터를 저장할 state 변수
  const [itemData,setItemData] = useState({
    itemName : '',
    itemPrice : '',
    itemIntro : '',
  })

  //키 입력마다 실행되는 함수
  const handleItemData = e => {
    setItemData({
      ...itemData,
      [e.target.name] : e.target.value
    });
  }

  //등록 클릭 시 spring으로 요청
  const regItem = () => {
    axios.post('http://localhost:8080/items', itemData)
    .then(response => {
      alert('성공');
    })
    .catch(e => console.log(e))
  }

  return (
    <div>
      <div>상품명
        <input 
          type="text"
          name='itemName'
          value={itemData.itemName}
          onChange={e => handleItemData(e)}
        />
      </div>
      <div>
        가격
        <input 
          type="text" 
          name='itemPrice'
          value={itemData.itemPrice}
          onChange={e => handleItemData(e)}
        />
      </div>
      <div>
        상품소개
        <textarea
          cols={50}
          rows={5} 
          name="itemIntro"
          value={itemData.itemIntro}
          onChange={e => handleItemData(e)}
        ></textarea>
      </div>
      <button 
        type='button'
        onClick={e => regItem()}
      >등록</button>
    </div>
  )
}

export default ItemForm
