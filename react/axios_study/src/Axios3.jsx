import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Axios3 = () => {
  //빽틱, 문자열과 변수를 편하게 함께 사용하는 문법
  const name = 'kim';
  const age = 20;
  const addr = '울산시';

  //내 이름은 kim이고, 나이는 20살이며, 사는 곳은 울산시입니다.
  console.log(`내 이름은 ${name}이고, 나이는 ${age}이며, 사는 곳은 ${addr}입니다.`)
  
  const [empNum, setEmpNum] = useState('');
  const [data, setData] =useState({});

  //버튼 클릭 시 사원 정보를 조회하는 함수

  const getEmpInfo = () => {
    axios(`http://localhost:8080/emps/${empNum}`)
    .then(response => setData(response.data))
    .catch(e =>console.log(e))
  }
  console.log(empNum)
  console.log(data)
  


  return (
    <div>
      <h3>아래 input태그에 입력한 사번을 가진 사원의 모든 정보를 버튼 클릭 시 출력!</h3>
      <input 
        type="text" 
        placeholder='사번 입력'
        value={empNum}
        onChange={e => setEmpNum(e.target.value)} 
      />
      <button 
        type='button'
        onClick={() => getEmpInfo()}
      >조회</button>
      <div>
        <p>조회 정보입니다</p>
        <p>사번 : {data.companyNum}</p>
        <p>사원명 : {data.name}</p>
        <p>급여 : {data.salary}</p>
        <p>부서명 : {data.dptName}</p>
        <p>직급 : {data.rank}</p>
      </div>
    </div>
  )
}

export default Axios3