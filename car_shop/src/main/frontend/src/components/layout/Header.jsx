import React from 'react'
import styles from './Header.module.css'
import { NavLink } from 'react-router-dom'

const Header = () => {
  return (
    <div className={styles.header}>
      <ul className={styles.menu}>
        <NavLink to=''><li>홈</li></NavLink>
        <NavLink to='/reg'><li>차량관리</li></NavLink>
        <li>판매정보등록</li>
        <li>판매목록조회</li>
      </ul>
    </div>
  )
}

export default Header