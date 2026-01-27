import React from 'react'
import styles from './RegForm.module.css'
const RegForm = () => {
  return (
    <div className={styles.listDiv}>
      <table className={styles.list}>
        <thead></thead>
        <tbody>
          <tr>
            <td>제목</td>
            <td>
              <input type="text" />
            </td>
          </tr>
          <tr>
            <td>작성자</td>
            <td>
              <input type="text" />
            </td>
          </tr>
          <tr>
            <td>내용</td>
            <td>
              <textarea/>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  )
}

export default RegForm