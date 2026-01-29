import React, { useEffect, useState } from 'react'
import styles from './BoardDetail.module.css'
import axios from 'axios'
import { useNavigate, useParams } from 'react-router-dom'
import Reply from './Reply'
const BoardDetail = () => {

  const {boardNum} = useParams();

  const [data,setData] = useState({});

  useEffect(()=>{
    axios.get(`http://localhost:8080/boards/${boardNum}`)
    .then(response => setData(response.data))
    .catch(e => console.log(e))
  },[])

  const nav = useNavigate();

  const deleteBoard = () => {
    axios.delete(`http://localhost:8080/boards/${boardNum}`)
    .then(response => {
      alert('삭제 완료')
      nav('/')
    })
    .catch(e => console.log(e))
  }

  return (
    <>
      <div className={styles.container}>
        <h2>게시글 상세 정보</h2>
        <table className={styles.detailTable}>
          <colgroup>
            <col width='15%'/>
            <col width='*'/>
            <col width='15%'/>
            <col width='15%'/>
            <col width='15%'/>
            <col width='8%'/>
          </colgroup>
          <thead></thead>
          <tbody>
            <tr>
              <td>작성일</td>
              <td>{data.createDate}</td>
              <td>작성자</td>
              <td>{data.writer}</td>
              <td>조회수</td>
              <td>{data.readCnt}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={5} className={styles.titleTd}>{data.title}</td>
            </tr>
            <tr>
              <td >내용</td>
              <td colSpan={5} className={styles.contentTd}>{data.content}</td>
            </tr>
          </tbody>
        </table>
        <div className={styles.btnDiv}>
          <button 
            type='button'
            onClick={e => nav('/')}  
          >목록가기</button>
          <button 
            type='button'
            onClick={e => nav(`/update/${boardNum}`)}  
          >수정</button>
          <button 
            type='button'
            onClick={e => deleteBoard()}
          >삭제</button>
        </div>
      </div>
      <Reply boardNum = {boardNum}/>
    </>
  )
}

export default BoardDetail