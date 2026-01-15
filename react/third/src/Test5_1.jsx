import React, { useState } from 'react'



const Test5_1 = () => {
  
  const person = {
  name : '김자바',
  age : 20,
  adr : '울산시'
  };
  
  const[man, manSet] = useState(person);

  
  
  return (
    <div>
      <h3>이름 : {man.name}</h3>
      <h3>나이 : {man.age}</h3>
      <h3>주소 : {man.adr}</h3>
      <div>
        <button type='button' onClick={() => {
          const copyMan = {...person};
          copyMan.name = '홍길동'
          manSet(copyMan);
        }}>이름을 홍길동으로 변경</button>
        <button type='button' onClick={() => {
          const copyMan = {...person};
          copyMan.age = 30;
          manSet(copyMan);
        }}>나이를 30으로 변경</button>
        <button type='button' onClick={() => {
          const copyMan = {...person};
          copyMan.adr = '서울시'
          manSet(copyMan);
        }}>주소를 서울시로 변경</button>
      </div>
    </div>
  )
}

export default Test5_1