import React, { useState } from 'react'
import './Test7.css'

const Test7 = () => {
  //TRUTHY -> true는 아닌데 true와 같은 결과로 판단 
  //FALSY -> false는 아닌데 false처럼 판단
  //truthy
  // 1. 0이 아닌 숫자
  // 2. 빈 문자열이 아닌 문자열

  //falsy
  // 1. 0
  // 2. 빈 문자열
  // 3. null
  // 4. undefined
  // 5. NaN     (Not a Number)  ex) console.log('java' * 10)

  //단락평가 : 논리연산에서 사용(&&, ||)
  console.log(true); //true
  console.log(true && 10); //10
  console.log(true || 10); //true
  console.log('' && 'java'); //''
  console.log(10 && 100); //100


  //div 보여준 여부를 결정하는 변수
  const [isShow, setIsShow] = useState(false);



  return (
    
    <>
      {/* 리액트에서 인라인으로 스타일 쓰는방법 */}
      <div 
        style={{
          width:'300px',
          height:'60px',
          backgroundColor : 'wheat',
          border : '1px solid red'
        }}
      >
      </div>

      <div 
        className='div1' 
        onMouseEnter={() => setIsShow(true)}
        onMouseLeave={() => setIsShow(false)}
      >
        <p>마우스를 올리면 숨겨진 글자가 보여요</p>
      </div>
      {/* 단락평가 (자바스크립트 문법) */}
      {isShow &&
        <div className='div2'>
          <p>Hello React!</p>
        </div>}  
       
    </>
  )
}

export default Test7