import React from 'react'

const Controller = ({setNum, num}) => {

  return (
    <div style={{
      backgroundColor : 'lightgray',
      padding : '12px',
      margin : '12px 0px'
    }}>
      <button 
        type='button'
        onClick={() => setNum(num - 10)}  
      >-10</button>
      <button 
        type='button'
        onClick={() => setNum( - 1)}
      >-1</button>
      <button 
        type='button'
        onClick={() => setNum(num + 1)}  
      >+1</button>
      <button 
        type='button'
        onClick={() => setNum(num + 10)}  
      >+10</button>
    </div>
  )
}

export default Controller
