import React, { useState } from 'react'

const Textarea = () => {
  //textarea에 입력한 데이터를 저장할 state 변수
  const [data, setData] = useState('');

  console.log(data)

  return (
    <div>
      <textarea 
        cols='50' 
        rows='5' 
        value={data}
        onChange={e => setData(e.target.value)}
      ></textarea>
    </div>
  )
}

export default Textarea