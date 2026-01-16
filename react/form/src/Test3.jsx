import React, { useState } from 'react'
import s from './Test3.module.css'
import './reset.css'

const Test3 = () => {
  const [data, setData] = useState({
    edu : '1',
    schoolName : '',
    history : 'n',
    licenseName : '',
    getDate : '2026-01-16',
    organ : '',
    companyName : '',
    job : '',
    term : 
      {
        termYear : '', 
        termMonth : ''
      },
    intro : ''
  })

  const handleData = e => {
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }
  
  const handleTermData = e => {
    setData({
      ...data,
      term : {...data.term, [e.target.name] : e.target.value}
    })
  }

  console.log(data)

  return (
    <div className={s.container}>
      <h1>이력서 정보</h1>
      <div className={s.d1}>
        <p>학력</p>
        <div>
          <select
            name='edu'
            value = {data.edu}
            style={{
              width : '110px'
            }}
            onChange={e => handleData(e)}
          >
            <option value="1">대졸</option>
            <option value="2">대학졸업예정</option>
            <option value="3">전문대졸</option>
            <option value="4">고졸</option>
          </select>
          <input 
            type="text"  
            placeholder='학교명'
            name='schoolName'
            value={data.schoolName}
            style={{
              width : '270px'
            }}
            onChange={e => handleData(e)}
          />
        </div>
      </div>
      <div className={s.d2}>
        <p>지원 구분</p>
        <div>
          <input 
            type="radio" 
            name='history'
            value='n'
            checked = {data.history === 'n'}
            onChange={e => handleData(e)}  
          />신입
          <input 
            type="radio" 
            name='history'
            value='o'
            checked = {data.history === 'o'}
            onChange={e => handleData(e)}  
          />경력
        </div>
      </div>
      <div className={s.d3}>
        <p>자격정보</p>
        <table>
          <thead>
            <tr>
              <td>자격증명</td>
              <td>취득일자</td>
              <td>발행기관</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>
                <input 
                  type="text"
                  name='licenseName'
                  value={data.licenseName}
                  onChange={e => handleData(e)} 
                />
              </td>
              <td>
                <input 
                  type="date"
                  name='getDate'
                  value={data.getDate}
                  onChange={e => handleData(e)}  
                />
              </td>
              <td>
                <input 
                  type="text"
                  name='organ'
                  value={data.organ}
                  onChange={e => handleData(e)}  
                />
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className={s.d4}>
        <p>경력정보</p>
        <table>
          <thead>
            <tr>
              <td>회사명</td>
              <td>담당업무</td>
              <td>경력기간</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>
                <input 
                  type="text" 
                  name='companyName'
                  value={data.companyName}
                  onChange={e => handleData(e)}  
                />
              </td>
              <td>
                <input 
                  type="text" 
                  name='job'
                  value={data.job}
                  onChange={e => handleData(e)}  
                />
              </td>
              <td>
                <input 
                  type="text" 
                  name='termYear'
                  value={data.term.year}
                  style={{
                  width : '30px'
                  }}
                  onChange={e => handleTermData(e)}
                />년
                <input 
                  type="text" 
                  name='termMonth'
                  value={data.term.month}
                  style={{
                  width : '60px'
                  }}
                  onChange={e => handleTermData(e)}
                />개월
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className={s.d5}>
        <p>자기소개</p>
        <textarea
          name='intro'
          value={data.intro}
          rows='4'
          onChange={e => handleData(e)}
        ></textarea>
      </div>
    </div>
  )
}

export default Test3