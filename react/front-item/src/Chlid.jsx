import React from 'react'

//컴포넌트의 매개변수 자리에 'props'라는 매개변수를 선언하면
//props 매개변수에 부모컴포넌트로부터 전달된 데이터를 확인할 수 있음
//props는 객체다!!
const Chlid = (props) => {
  console.log(props);


  return (
    <>
     <div>{props.addr}</div> 
    </>
  )
}

export default Chlid
