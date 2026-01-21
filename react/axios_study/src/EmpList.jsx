import axios from 'axios'
import React, { useEffect, useState } from 'react'
import './EmpList.css'

//state 변수 초기값을 null로 주는경우 -> 단락평가로 실행가능 
const EmpList = () => {
  const [emps,setEmps] = useState([]);

  useEffect(()=>{
    axios.get('http://localhost:8080/emps')
    .then(response => setEmps(response.data))
    .catch(e => console.log(e))
  },[])

  console.log(emps)
  
  return (
    <div className='container'>
      <table>
        <thead>
          <tr>
            <td>사번</td>
            <td>이름</td>
            <td>부서명</td>
            <td>급여</td>
            <td>직급</td>
          </tr>
        </thead>
        <tbody>
          {
            emps.map((e, i) => {
              return(
                <tr key={e.companyNum}>
                  <td>{e.companyNum}</td>
                  <td>{e.name}</td>
                  <td>{e.dptName}</td>
                  <td>{e.salary}</td>
                  <td>{e.rank}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default EmpList