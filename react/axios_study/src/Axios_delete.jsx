import axios from 'axios'
import React, { useState } from 'react'

const Axios_delete = () => {
  //input태그에 입력한 데이터를 저장할 state변수
  const [empNo, setEmpNo] = useState('')
  
  console.log(empNo)
  
  //삭제 함수
  const deleteEmp = () => {
    axios.delete(`http://localhost:8080/emps/${empNo}`)
    .then(response => alert(response.data))
    .catch(e => console.log(e))
  }

  return (
    <div>
      <h3>데이터 삭제</h3>
      <p>삭제할 사원의 사번을 입력하세요.</p>
      <input 
        type="text" 
        onChange={e => setEmpNo(e.target.value)}
      />
      <button type='button' onClick={e => deleteEmp()}>삭제</button>
    </div>
  )
}

export default Axios_delete