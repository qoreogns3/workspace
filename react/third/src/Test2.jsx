import React, { useState } from 'react'

const Test2 = () => {
  const [display, setDisplay] = useState('ON');
  const [btn, setBtn] = useState('OFF');

  return (
    <div>
      <h1>{display}</h1>
      <button type='button' onClick={() => {
        setDisplay(display === 'ON' ? 'OFF' : 'ON');
        setBtn(btn === 'OFF' ? 'ON' : 'OFF');
      }}> {btn} </button>
    </div>
  )
}

export default Test2