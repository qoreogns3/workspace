import React, { useState } from 'react'


const Test5 = () => {
  //객체의 스트레드 연산자
  let student = {
    stuNum : 1,
    name : 'kim',
    score : 80
  };

  const basicInfo = {
    adrr : '울산시',
    age : 30
  };

  const result = {
    ...student,
    ...basicInfo
  }

  //student 객체의 score키를 30으로 변경
  student = {
    ...student,
    score : 30
  };

  //--------------------------//
  const [man, setMan] = useState({
    name : '김자바',
    age : 20,
    adr : '울산시'
  });
  
  return (
    <>
      <h3>이름 : {man.name}</h3>
      <h3>나이 : {man.age}</h3>
      <h3>주소 : {man.adr}</h3>
      <button type='button' onClick={() => {
        setMan({...man, name : '홍길동'});
      }}>이름을 홍길동으로 변경</button>
      <button type='button' onClick={() => {
        setMan({...man, age : 30});
      }}>나이를 30으로 변경</button>
      <button type='button' onClick={() => {
        setMan({...man, adr : '서울시'});
      }}>주소를 서울시로 변경</button>
    </>
  )
}

export default Test5