import React, { useState } from 'react'
import './Test.module.css'

const Test = () => {

  const [data, setData] = useState({
    name : '',
    korScore : '',
    engScore : ''
  })

  const handleData = e => {
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }
  

  return (
    <div className='container'>
      <div className='info'>
        <div>
          이름
          <input 
            type="txt"
            name='name'
            value= {data.name}
            onChange={e => handleData(e)} 
          />
        </div>
        <div>
          국어점수 
          <input 
            type="text"
            name='korScore'
            value= {data.korScore}
            onChange={e => handleData(e)} 
          />
        </div>
        <div>
          영어점수 
          <input 
            type="text"
            name='engScore'
            value= {data.engScore}
            onChange={e => handleData(e)} 
          />
        </div>
      </div>
      <div className='dataInfo'>
        <p>입력한 학생 정보입니다.</p>
        <br />
        <p>이름 : {data.name}</p>
        <p>국어점수 : {data.korScore}</p>
        <p>영어점수 : {data.engScore}</p>
        <p>총점 : {Number(data.korScore) + Number(data.engScore)}</p>
      </div>
    
    </div>
  )
}

export default Test