import React, { useState } from 'react'
import Title from './Title'
import Display from './Display'
import Controller from './Controller'

const Test6 = () => {
  //state 변경 함수가 실행되면 state변수가 선언된 컴포넌트가 리렌더링

  const [num, setNum] = useState(0)

  return (
    <>
      <Title/>
      <Display 
        num = {num}
      />
      <Controller
        num = {num}
        setNum = {setNum}
      /> 
    </>
  )
}

export default Test6
