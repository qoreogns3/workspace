import React, { useEffect, useState } from 'react'
import styles from './BoardList.module.css'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const BoardList = () => {
  const [list,setList] = useState([]);
  useEffect(()=>{
    axios.get('http://localhost:8080/boards')
    .then(response => setList(response.data))
    .catch(e => console.log(e))
  }, [])

  const nav = useNavigate();

  return (
    <>
      <div className={styles.container}>
        <div className={styles.searchDiv}>
          <select>
            <option value="">제목</option>
            <option value="">작성자</option>
          </select>
          <input type="text" />
          <button type='button'>검색</button>
        </div>
        <div className={styles.listDiv}>
          <table className={styles.listTable}>
            <thead>
              <tr>
                <td>No</td>
                <td>제목</td>
                <td>작성자</td>
                <td>작성일</td>
                <td>조회수</td>
              </tr>
            </thead>
            <tbody>
              {
                list.map((data, i) => {
                  return(
                    <tr>
                      <td>{data.boardNum}</td>
                      <td>{data.title}</td>
                      <td>{data.writer}</td>
                      <td>{data.createDate}</td>
                      <td>{data.readCnt}</td>
                    </tr>
                  )
                })
              }
            </tbody>
          </table>
          <button 
            type='button'
            onClick={e => {nav('/reg')}}
          >글쓰기</button>
        </div>
        <div className={styles.btn}>
          
        </div>
      </div>
    </>
  )
}

export default BoardList