import React, { useEffect, useState } from 'react'
import styles from './BoardList.module.css'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const BoardList = () => {
  const [list,setList] = useState([]);

  useEffect(()=>{
    axios.get('http://localhost:8080/boards',search)
    .then(response => setList(response.data))
    .catch(e => console.log(e))
  }, []);

  const nav = useNavigate();

  const [option, setOpiton] = useState('title');

  const [search, setSearch] = useState('');

  const searchList = () => {
    if (option == 'title'){
      
    }
  console.log(search)  
  }

  return (
    <>
      <div className={styles.container}>
        <div className={styles.searchDiv}>
          <select value={option} onChange={e => setOpiton(e.target.value)}>
            <option value="title">제목</option>
            <option value="writer">작성자</option>
          </select>
          <input 
            type="text"
            value={search}
            onChange={e => setSearch(e.target.value)} 
          />
          <button 
            type='button'
            onClick={e => {

            }}
          >검색</button>
        </div>
        <div className={styles.listDiv}>
          <table className={styles.listTable}>
            {/* 테이블의 각 컬럼 너비값 지점 */}
            <colgroup> 
              <col width='7%'/>
              <col width='*'/>
              <col width='15%'/>
              <col width='25%'/>
              <col width='10%'/>
            </colgroup>
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
                    <tr key={data.boardNum}>
                      <td>{list.length -i}</td>
                      <td
                        style={{cursor : 'pointer'}}
                        onClick={e => {
                          nav(`/detail/${data.boardNum}`)
                        }}
                      >{data.title}</td>
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