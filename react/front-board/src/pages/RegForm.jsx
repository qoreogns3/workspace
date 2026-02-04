import React, { useState } from 'react'
import styles from './RegForm.module.css'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'
const RegForm = () => {
  const [data, setData] = useState({
    title : '',
    writer : '',
    content : ''
  })

  const handleData = e => {
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }

  const nav = useNavigate();

  const regData = () => {
    axios.post('http://localhost:8080/boards', data)
    .then(response => {
      alert('등록 완료!')
      nav('/')
    })
    .catch(e => console.log(e))
  }


  return (
    <>
      <div className={styles.container}>
        <h2>게시글 작성 페이지</h2>
        <table className={styles.reg}>
          <thead></thead>
          <tbody>
            <tr>
              <td>제목</td>
              <td>
                <input 
                  type="text"
                  className={styles.titleText}
                  name='title'
                  value={data.title}
                  onChange={e => handleData(e)}
                />
              </td>
            </tr>
            <tr>
              <td>작성자</td>
              <td>
                <input 
                  type="text" 
                  className={styles.writerText}
                  name='writer'
                  value={data.writer}
                  onChange={e => 
                    {handleData(e)}
                  }
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td>
                <textarea 
                  className={styles.contentArea}
                  rows={15}
                  name='content'
                  value={data.content}
                  onChange={e => handleData(e)}  
                />
              </td>
            </tr>
          </tbody>
        </table>
        <button
          onClick={e => {
            data.title.trim() === '' || data.writer.trim() === '' ?
            alert('제목과 작성자를 입력해주세요')
            : regData()
          }}
        >글등록</button>
      </div>
      
    </>
  )
}

export default RegForm