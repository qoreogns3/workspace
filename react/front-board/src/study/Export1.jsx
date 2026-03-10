import React from 'react'

//js 파일의 변수 및 함수 import 방식 1
//구조분해할당으로 age와 test1을 가져오겠다.
import { age, test1 } from '../util/myMath'

//js 파일의 변수 및 함수 import 방식 2
// 전체를 fun이라는 이름의 객체로 가져오겠다.
import * as fun from '../util/myMath'

const Export1 = () => {
  const data1 = age;
  test1();
  console.log(fun.name);
  fun.test2();
  
  return (
    <div>Export1</div>
  )
}

export default Export1