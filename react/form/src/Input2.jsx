import React, { useState } from 'react'

const Input2 = () => {
  const [data1, setData1] = useState('');
  const [data2, setData2] = useState('');

  console.log(data1, data2);

  return (
    <>
      <div>
        <input 
          type="text" 
          value={data1} 
          onChange={e => setData1(e.target.value)}
        />
      </div>
      <div>
        <input 
          type="text" 
          value={data2} 
          onChange={e => setData2(e.target.value)}
        />
      </div>
      <div 
        style={{
          display : 'flex', 
          flexDirection : 'row', 
          gap : '15px'}}
        >
        <p>{data1}</p>
        <p>{data2}</p>
      </div>
    </>
  )
}

export default Input2