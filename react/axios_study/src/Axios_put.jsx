import axios from 'axios';
import React, { useState } from 'react'

const Axios_put = () => {
  const [emp, setEmp] = useState({
    companyNum : '',
    dptName : '영업부',
    salary : ''
  });

  const handleEmp = e => setEmp({
    ...emp,
    [e.target.name] : e.target.value
  });

  const putEmp = () => {
    axios.put(`http://localhost:8080/emps/${emp.companyNum}`, emp)
    .then(response => {alert(response.data)})
    .catch(e => console.log(e))
  };

  console.log(emp);
  
  return (
    <div>
      <h3>사원 정보 수정</h3>
      <div>
        사번
        <input 
          type="text"
          value={emp.companyNum}
          name='companyNum'
          onChange={e => handleEmp(e)} 
        />
      </div>
      <div>
        수정할 부서
        <select
          value={emp.dptName}
          name = 'dptName'
          onChange={e => handleEmp(e)}
        >
          {/* select에서 option value값을 정해줘야함 */}
          {/* state변수에서 초기값을 option value값으로 지정 */}
          <option value='개발부'>개발부</option>
          <option value='영업부'>영업부</option>
          <option value='인사부'>인사부</option>
        </select>
      </div>
      <div>
        수정할 급여
        <input 
          type="text" 
          value={emp.salary}
          name='salary'
          onChange={e => handleEmp(e)}
        />
      </div>
      <div>
        <button 
          type='button'
          onClick={e => putEmp()}  
        >수정</button>
      </div>
    </div>
  )
}

export default Axios_put