import React, { useState } from 'react'
// input 3개 만들기

// 이름

// 이메일

// 비밀번호

// 모든 input은 하나의 state 객체로 관리

// input에 입력한 값이 state에 저장되도록 만들기

// 제출 버튼 클릭 시

// alert로 입력한 정보 출력

const Member = () => {
  const [data, setData] = useState({
    name : '',
    email : '',
    pw : ''
  })

  const handleData = (e) => {
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }

  const alertData = () => {
    alert(JSON.stringify(data))
  }

  console.log(data)

  return (
    <div>
      <div>
        이름 : 
        <input 
          type="text" 
          value={data.name} 
          name='name' 
          onChange={e => handleData(e)} />
      </div>
      <div>
        이메일 : 
        <input 
          type="text" 
          value={data.email} 
          name='email' 
          onChange={e => handleData(e)} />
      </div>
      <div>
        패스워드 : 
        <input 
          type="password" 
          value={data.pw} 
          name='pw' 
          onChange={e => handleData(e)} />
      </div>
      <button 
        type='button'
        onClick={e => {alertData()}}>
          제출
      </button>
    </div>
  )
}

export default Member
