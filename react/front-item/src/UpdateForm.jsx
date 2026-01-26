import axios from 'axios';
import React, { useState } from 'react'

const UpdateForm = () => {
  //인풋태그에 입력한 정보를 저장하는 state변수
  const [updateData, setUpdateData] = useState({
    itemNum : '',
    itemName : '',
    itemPrice : ''
  });

  //데이터 변경 함수
  const handleUpdateData = e => setUpdateData({
    ...updateData,
    [e.target.name] : e.target.value
  })

  //수정 함수
  const updateItem = () => {
    axios.put(`http://localhost:8080/items/${updateData.itemNum}`, updateData)
    .then(response => alert('수정 완료'))
    .catch(e => console.log(e))
  }

  return (
    <>
      <h2>상품 정보 수정</h2>
      <div>상품번호
        <input 
          type="text" 
          name="itemNum"
          value={updateData.itemNum}
          onChange={e => handleUpdateData(e)}
        />
      </div>
      <div>상품명
        <input 
          type="text" 
          name='itemName'
          value={updateData.itemName}
          onChange={e => handleUpdateData(e)}
        />
      </div>
      <div>가격
        <input 
          type="text" 
          name='itemPrice'
          value={updateData.itemPrice}
          onChange={e => handleUpdateData(e)}  
        />
      </div>
      <button 
        type='button'
        onClick={e => updateItem()}
      >수정</button>
    </>
  )
}

export default UpdateForm
