import React from 'react'

const Display = (props) => {

  return (
    <div style={{
      backgroundColor : 'lightgray',
      padding : '12px',
      margin : '12px 0px'
    }}>
      <p>현재 카운트 : </p>
      <p>{props.num}</p>  
    </div>
  )
}

export default Display
