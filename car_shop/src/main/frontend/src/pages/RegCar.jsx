import React from 'react'
import styles from './RegCar.module.css'

const RegCar = () => {
  return (
    <div className={styles.container}>
      <div>
        <p>차량등록</p>
        <div className={styles.reg_car}>
          <div>
            <p>제조사</p>
            <select name="" id="">
              <option value="">KIA</option>
              <option value="">HYUNDAE</option>
              <option value="">RENAULT</option>
              <option value="">CHEVROLET</option>
            </select>
          </div>
          <div>
            <p>모델명</p>
            <input type="text" />
          </div>
          <div>
            <p>차량가격</p>
            <input type="text" />
          </div>
        </div>
      </div>
    </div>
  )
}

export default RegCar