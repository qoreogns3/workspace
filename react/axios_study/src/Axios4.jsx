import axios from 'axios'
import React, { useState } from 'react'

const Axios4 = () => {
  const [empNum, setEmpNum] = useState('0')
  const [data, setData] = useState({})

  console.log(empNum);
  console.log(data);
  
  const getEmpInfo = (e) => {
    axios(`http://localhost:8080/emps/${e}`)
    .then(response => setData(response.data))
    .catch(e => console.log(e)) 
  }

  return (
    <div>
      <h3>조회할 사번 선택</h3>
      <select 
        value={empNum}

        onChange={e =>{
          setEmpNum(e.target.value)
          getEmpInfo(e.target.value)}
        }  
      >
        <option value={'0'}>사번 선택</option>
        <option value={'1'}>1</option>
        <option value={'2'}>2</option>
        <option value={'3'}>3</option>
        <option value={'4'}>4</option>
        <option value={'5'}>5</option>
      </select>

      <div>
        <p>조회한 사원 정보입니다.</p>
        <p>사번 : {data.companyNum}</p>
        <p>사원명 : {data.name}</p>
        <p>직급 : {data.rank}</p>
        <p>급여 : {data.salary}</p>
        <p>부서명 : {data.dptName}</p>
      </div>
      
    </div>
  )
}

export default Axios4