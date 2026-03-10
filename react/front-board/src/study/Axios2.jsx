import axios from 'axios'
import React, { useState } from 'react'

const Axios2 = () => {
  //조회한 학생 정보를 저장한 state변수
  const [stuInfo, setStuInfo] = useState({});

  //학생의 상세 정보 조회 및 점수 조회
  const getData = () => {
    //학번이 1001번인 학생의 정보를 조회
    axios.get('http:localhost:8080/students/1001')
    .then(response => {
      setStuInfo(response.data)
    })
    .catch();

    //조회한 학생의 성적 정보 조회
    axios.get(`http:localhost:8080/grades/${stuInfo.gradeNum}`)
    .then()
    .catch();
  }

  return (
    <div>Axios2</div>
  )
}

export default Axios2