import { Route, Routes } from 'react-router-dom'
import Header from './components/Header'
import './reset.css'
import BoardList from './pages/BoardList'
import RegForm from './pages/RegForm'
import BoardDetail from './pages/BoardDetail'
import UpdataForm from './pages/UpdataForm'
import UseState1 from './study/UseState1'
import UseState2 from './study/UseState2'
import Axios1 from './study/Axios1'
import Axios2 from './study/Axios2'
import Axios3 from './study/Axios3'

function App() {

  return (
    <>
      <Header/>

      {/* 모든 페이지가 보여질 영역 */}
      <div style={{
        width : '50%',
        margin : "30px auto"
      }}>
        {/* <UseState1/> */}
        {/* <UseState2/> */}
        {/* <Axios1/> */}
        {/* <Axios2/>
        <Axios3/> */}
      
        <Routes>
          {/* 게시글 목록 페이지, localhost:5173 */}
          <Route path='/' element={<BoardList/>}/>
          {/* 게시글 상세 조회 페이지 */}
          <Route path='/detail/:boardNum' element={<BoardDetail/>}/>
          {/* 게시글 등록 페이지, localhost:5173/reg */}
          <Route path='/reg' element={<RegForm/>}/>
          {/* 게시글 수정 페이지 */}
          <Route path='/update/:boardNum' element={<UpdataForm/>}/>
        </Routes>
      </div>
      
    </>
  )
}

export default App
