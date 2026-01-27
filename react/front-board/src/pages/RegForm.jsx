import React from 'react'
import styles from './RegForm.module.css'
const RegForm = () => {
  return (
    <div className={styles.container}>
      <table className={styles.reg}>
        <thead></thead>
        <tbody>
          <tr>
            <td>제목</td>
            <td>
              <input 
                type="text"
                className={styles.titleText}
              />
            </td>
          </tr>
          <tr>
            <td>작성자</td>
            <td>
              <input 
                type="text" 
                className={styles.writerText}
              />
            </td>
          </tr>
          <tr>
            <td>내용</td>
            <td>
              <textarea 
                className={styles.contentArea}
                rows={15}  
              />
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  )
}

export default RegForm