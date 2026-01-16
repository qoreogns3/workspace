import React, { useState } from 'react'

const Test1 = () => {
  const [data, setData] = useState({
    name : '',
    age : '',
    grade : '1',
    sex : 'm',
    intro : ''
  });

  const handleData = e => {
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }

  console.log(data)

  return (
    <div>
      <div>
        이름
        <input 
          type="text"
          name='name'
          value={data.name}
          onChange={e => handleData(e)}
        />
      </div>
      <div>
        나이
        <input 
          type="text"
          name='age'
          value={data.age}
          onChange={e => handleData(e)} 
        />
      </div>
      <div>
        학년
        <select
          name='grade'
          value={data.grade}
          onChange={e => handleData(e)}
        >
          <option value='1'>1학년</option>
          <option value='2'>2학년</option>
          <option value='3'>3학년</option>
        </select>
      </div>
      <div>
        성별
        <input 
          type="radio" 
          name='sex' 
          value='m'
          onChange={e => handleData(e)}
        />남
        <input 
          type="radio" 
          name='sex' 
          value='w'
          onChange={e => handleData(e)}
        />여
      </div>
      <div>
        소개말
        <textarea
          name='intro'
          value={data.intro}
          onChange={e => handleData(e)}
        >
        </textarea>
      </div>
    </div>
  )
}

export default Test1