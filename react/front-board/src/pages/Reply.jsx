import React, { useEffect, useState } from 'react'
import styles from './Reply.module.css'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const Reply = (props) => {

  const nav = useNavigate();
  
  const [replyList, setReplyList] = useState([]);

  useEffect(()=>{
    axios.get(`http://localhost:8080/boards/reply/${props.boardNum}`)
    .then(response => setReplyList(response.data))
    .catch(e => console.log(e))  
  }, [])

  const [reply, setReply] = useState({
    writer : '',
    content : ''
  });

  const handleReply = e => {
    setReply({
      ...reply,
      [e.target.name] : e.target.value
    })
  };


  const regReply = () => {
    reply.writer === '' || reply.content === '' ?
    alert('작성자와 내용을 입력해주세요.')
    : axios.post(`http://localhost:8080/boards/reply/${props.boardNum}`, reply)
    .then(response =>{ 
        alert('등록 완료')
        nav(0)
     })
    .catch(e => console.log(e))
  };
  
  const deleteReply = (num) => {
    axios.delete(`http://localhost:8080/boards/reply/${num}`)
    .then(response => {
      alert('삭제 완료')
      nav(0)
    })
    .catch(e => console.log(e))
  }

  return (
    <>
      <div className={styles.container}>
        <div className={styles.regDiv}>
          <input 
            type="text"
            placeholder='작성자'
            name='writer'
            value={reply.writer}
            onChange={e => handleReply(e)} 
            style={{
              width : '15%',
              fontSize : '16px',
              padding : '5px 10px'
            }}
          />
          <input 
            type="text" 
            placeholder='댓글 내용 입력'
            name='content'
            value={reply.content}
            onChange={e => handleReply(e)}
            style={{
              width : '73%',
              fontSize : '16px',
              padding : '5px 10px'
            }} 
          />
          <button 
            type='button'
            onClick={e => regReply()}
          >댓글등록</button>
        </div>
        <div>
          {replyList.map((data, i) => {
            return (
              <div key={i} className={styles.reply}>
                <div className={styles.writerDiv}>
                  <p>{data.writer}</p>
                  <p>{data.regDate}</p>
                </div>
                <div className={styles.delete}>
                  <p>{data.content}</p>
                  <button
                    type='button'
                    onClick={e => {deleteReply(data.replyNum)}}  
                  >삭제</button>  
                </div>
                <hr className={styles.hr}/>
              </div>
            )
          })}
        </div>
      </div>
    </>
  )
}

export default Reply