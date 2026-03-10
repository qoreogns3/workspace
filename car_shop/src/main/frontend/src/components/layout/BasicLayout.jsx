import React from 'react'
import Header from './header'
import styles from './BasicLayout.module.css'
import { Outlet } from 'react-router-dom'

const BasicLayout = () => {
  return (
    <div className={styles.container}>
      <Header/>
      <div>
        <Outlet/>
      </div>
    </div>
  )
}

export default BasicLayout