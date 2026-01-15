import React, { useState } from 'react'

const Test6 = () => {
  const [num, numSet] = useState(0);

  const changeNum = int => {
    numSet(num + int);
  }

  return (
    <div>
      <h3>Simple Counter</h3>
      <div>
        <p>현재 카운트 :</p>
        <p>{num}</p>
      </div>
      <div>
        <button type='button' onClick={() => changeNum(-1)}>-1</button>
        <button type='button' onClick={() => changeNum(-10)}>-10</button>
        <button type='button' onClick={() => changeNum(-100)}>-100</button>
        <button type='button' onClick={() => changeNum(+100)}>+100</button>
        <button type='button' onClick={() => changeNum(+10)}>+10</button>
        <button type='button' onClick={() => changeNum(+1)}>+1</button>
      </div>
    </div>
  )
}

export default Test6