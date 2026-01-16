import React, { useState } from 'react'

const Test2 = () => {
  const [data, setData] = useState({
    type : '1',
    num : '1',
    date : '2026-01-16',
    text : ''
  })
  
  const handleData = e => {setData({
    ...data,
    [e.target.name] : e.target.value
  })}

  console.log(data)

  return (
    <div>
      <h1>치킨!!!</h1>
      <p>치킨 종류와 상관없이 무조건 만원!</p>
      <div>
        <div>
          <input 
            type="radio"
            name='type'
            value='1'
            checked={data.type === '1'}
            onChange={e => handleData(e)}
          />후라이드치킨
          <input 
            type="radio" 
            name='type'
            value='2'
            checked={data.type === '2'}
            onChange={e => handleData(e)}  
          />양념치킨
          <input 
            type="radio" 
            name='type'
            value='3'
            checked={data.type === '3'}
            onChange={e => handleData(e)}
          />간장치킨
        </div>
      </div>
      <div>
        <div>
          <input 
            type="radio" 
            name='type'
            value='4'
            checked={data.type === '4'}
            onChange={e => handleData(e)}
          />고추바사삭
          <input 
            type="radio" 
            name='type'
            value='5'
            checked={data.type === '5'}
            onChange={e => handleData(e)}
          />뿌링클
          <input 
            type="radio" 
            name='type'
            value='6'
            checked={data.type === '6'}
            onChange={e => handleData(e)}  
          />매운핫치킨
        </div>
      </div>
      <div>
        <div>
          몇마리
          <input 
            type="number" 
            name='num'
            value={data.num}
            onChange={e => handleData(e)}  
          />
        </div>
        <div>
          주문일
          <input 
            type="date"
            name='date'
            value={data.date}
            onChange={e => handleData(e)}
          />
        </div>
      </div>
      <div>
        <p>요청사항</p>
        <textarea
          name='text'
          value={data.text}
          onChange={e => handleData(e)}
        ></textarea>        
      </div>
    </div>
  )
}

export default Test2