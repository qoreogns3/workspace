import axios from 'axios'
import React, { useEffect, useState } from 'react'

const Axios2 = () => {
  //spring의 응답으로 가져온 사원 정보 중 사원의 이름과 사원의 급여를
  //화면의 출력하세요
  const [data,setData] = useState({
    
  });

  useEffect(() => {
    axios.get('http://localhost:8080/emps/1')
    .then(response => {
      console.log(response.data);
      setData(response.data)
    })
    .catch(e => {});
  },[])

  return (
    <div>
      <p>이름 : {data.name}</p>
      <p>급여 : {data.salary}</p>
    </div>
  )
}

export default Axios2