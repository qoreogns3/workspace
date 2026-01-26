import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Itemlist = () => {
  //조회한 상품목록 데이터를 저장할 state 변수
  const [ItemList, setItemList] = useState([]);

  //재조회를 위한 state 변수
  const [cnt,setCnt] = useState({});

  //마운트되면 spring에서 상품목록을 조회 후 데이터를 가져온다
  //마운트 + cnt값이 변경되어서 리렌더링 될 경우! 
  useEffect(() => {
    axios.get('http://localhost:8080/items')
    .then(response => {
      console.log(response.data);
      setItemList(response.data);
    })
    .catch(e => console.log(e))
  }, [cnt]);

  //삭제 함수
  const deleteItem = (itemNum) => {
    axios.delete(`http://localhost:8080/items/${itemNum}`)
    .then(response => {
      //1. 방금 삭제한 데이터는 표에서 삭제해 주세요
      //2. 상품 목록을 다시 조회해서 표를 그리세요(이 방법을 사용)
      setCnt({})
      alert('삭제 성공')
    })
    .catch(e => console.log(e))
  }

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
            <td>삭제</td>
          </tr>
        </thead>
        <tbody>
        {
          //조회되는 데이터가 있나? 행 갯수만큼 그린다 : 데이터가 없습니다 그린다.
          ItemList.length != 0 
          ?
          ItemList.map((item, i) => {
            return(
              <tr key={i}>
                <td>{item.itemNum}</td>
                <td>{item.itemName}</td>
                <td>{item.itemPrice}</td>
                <td>{item.regDate}</td>
                <td>
                  <button 
                    type='button'
                    onClick={e => deleteItem(item.itemNum)}
                  >삭제</button>
                </td>
              </tr>
            )
          })
          :
          <tr>
            <td colSpan={4}>조회된 상품이 없습니다</td>
          </tr>
        }
        </tbody>
      </table>
    </>
  )
}

export default Itemlist
