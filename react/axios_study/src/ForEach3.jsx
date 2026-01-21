import React from 'react'

const ForEach3 = () => {
  const options = ['c++', 'java', 'python']


  return (
    <div>
      <select>
        <option value='0'>과목선택</option>
        {
          options.map((e, i) => {
            return (
              <option value={i + 1} key={i}>{e}</option>
            )
          })
        }
      </select>
    </div>
  )
}

export default ForEach3