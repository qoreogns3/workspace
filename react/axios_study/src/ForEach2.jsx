import React from 'react'

const ForEach2 = () => {
  const arr = [1, 5.5, 'react']

  return (
    <>
      <div>
        {
          arr.map((e, i) => {
            return (
              <div key={i}>
                {e}
              </div>
            )
          })
        }
      </div>
    </>
  )
}

export default ForEach2