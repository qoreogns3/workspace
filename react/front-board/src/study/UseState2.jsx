import React, { useState } from 'react'

//객체의 함수형 업데이트 사용방법
const UseState2 = () => {
  const [member, setMember] = useState({
    name : 'kim',
    age : 20,
    addr : '서울시'
  });





  return (
    <div>
      <div>
        이름 : {member.name} <br/>
        나이 : {member.age} <br/>
        주소 : {member.addr}  
      </div>

      <button
        type='button'
        onClick={e => {
          //일반 방식
          // setMember({
          //   ...member,
          //   name : 'lee'
          // });
          
          //함수형 업데이트 사용 방식
          //화살표 함수에서 {} 안이 객체 형태일때 {} 생략시 소괄호로 감싼다
          setMember(prev => ({...prev, name : 'lee'}));
          

          // setMember({
          //   ...member,
          //   age : 30
          // });

          setMember(prev => ({...prev, age : 30}))
        }}
      >클릭</button>
    </div>
  )
}

export default UseState2