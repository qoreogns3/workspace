import React, { useEffect, useState } from 'react'
import styles from './updateForm.module.css'
import axios from 'axios'
import { useNavigate, useParams } from 'react-router-dom'
const UpdataForm = () => {
  
  const [data,setData] = useState({})
  
  

  const [update,setUpdate] = useState({
    title : '',
    content : ''
  })

  const {boardNum} = useParams();

  useEffect(() => {
    axios.get(`http://localhost:8080/boards/update/${boardNum}`)
    .then(response =>{ 
      setData(response.data)
      setUpdate({
        title : response.data.title,
        content : response.data.content
      })
    })
    .catch(e => console.log(e))
  },[])

  const handlUpdate = e => {
    setUpdate({
      ...update,
      [e.target.name] : e.target.value
    })
  }

  const updateData = () => {
    axios.put(`http://localhost:8080/boards/${boardNum}`, update) // 데이터 전달은 put과 post만 가능! get은 안됨!
    .then(response => {
      alert('수정 성공');
      nav(`/detail/${boardNum}`)
    })
    .catch(e => console.log(e))

  }

  const nav = useNavigate();

  return (
    <>
      <div className={styles.container}>
        <h2>게시글 수정</h2>
        <table className={styles.updateTable}>
          <thead></thead>
          <tbody>
            <tr>
              <td>작성일</td>
              <td>{data.createDate}</td>
              <td>작성자</td>
              <td>{data.writer}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={3}>
                <input 
                  type="text"
                  className={styles.titleText} 
                  name='title'
                  //value와 onchange는 같은 데이터를 다루어야한다.
                  value={update.title}
                  onChange={e => handlUpdate(e)}
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={3}>
                <textarea
                  className={styles.contentArea}
                  rows={10}
                  name='content'
                  value={update.content}
                  onChange={e => handlUpdate(e)}
                />
              </td>
            </tr>
          </tbody>
        </table>
        <div className={styles.btnDiv}>
          <button 
            type='button'
            onClick={e => nav(-1)} 
          >뒤로가기</button>
          <button 
            type='button'
            onClick={e => {
              update.title == '' || update.title == '' ?
              alert('제목과 내용을 입력해주세요')
              : updateData()
            }}
          >수정</button>
        </div>
      </div>
    </>
  )
}

export default UpdataForm