import React from 'react'
import Chlid from './Chlid'
import Child2 from './Child2'

//props를 이용해 컴포넌트간 데이터를 전달하는 것은
//부모컴포넌트에서 자식컴포넌트로만 가능!
const Parent = () => {
  const num = 10;
  return (
    <>
      <h2>parent 컴포넌트</h2> 
      {/* num데이터를 myData라는 이름으로 전달 */}
      <Chlid 
        myData={num} 
        age={20} 
        addr={'울산시'}
      />
      <Child2/>
    </>
  )
}

export default Parent
