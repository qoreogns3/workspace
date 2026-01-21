import axios from 'axios';
import React, { useState } from 'react'

const Axios_post = () => {
  const [emp, setEmp] = useState({
    companyNum : '',
    name : '',
    dptName : '',
    salary : '',
    rank : ''
  });
  const setEmpDetail = e => {
    setEmp({
      ...emp,
      [e.target.name] : e.target.value
    })
  }

  //등록 버튼 클릭 시 spring으로 요청을 보내는 함수
  //post 함수의 두번째 매개변수는 spring으로 전달할 데이터다.
  //전달할 데이터는 객체 형태로 보내야 함
  const postEmp = () => {
    axios.post('http://localhost:8080/emps', emp)
    .then(response => alert('통신 성공')
    )
    .catch(e => {})
  }



  const changeInfo = e => setEmp({
        ...emp,
        companyNum : e.target.value
      })

  return (
    <div>
      <h3>입력 데이터 spring으로 전달하기</h3>
      <div>
        사번
        <input 
          type="text"
          name='companyNum'
          value={emp.companyNum}
          onChange={e => setEmpDetail(e)} 
        />
      </div>
      <div>
        사원명
        <input 
          type="text"
          name='name'
          value={emp.name}
          onChange={e => setEmpDetail(e)} 
        />
      </div>
      <div>
        급여
        <input 
          type="text"
          name='salary'
          value={emp.salary}
          onChange={e => setEmpDetail(e)}  
        />
      </div>
      <div>
        부서명
        <input 
          type="text"
          name='dptName' 
          value={emp.dptName}
          onChange={e => setEmpDetail(e)} 
        />
      </div>
      <div>
        직급
        <input 
          type="text"
          name='rank' 
          value={emp.rank}
          onChange={e => setEmpDetail(e)} 
        />
      </div>
      <div>
        <button 
          type='button'
          onClick={e => postEmp()}
        >등록</button>
      </div>
    </div>
  )
}

export default Axios_post