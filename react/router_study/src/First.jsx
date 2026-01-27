import React from 'react'
import { useParams } from 'react-router-dom'

const First = () => {
  //URL Parameter로 전달되는 데이터 받기
  //useParams() 실행시 객체타입으로 리턴한다.

  //const params = useParams();

  //구조분해할당으로 받을수 있음
  const {age} = useParams();

  return (
    <>
      <h3>First 컴포넌트입니다</h3>
      <p>/first url을 입력하면 컴포넌트가 보입니다.</p>
      <p>{age}</p>
    </>
  )
}

export default First