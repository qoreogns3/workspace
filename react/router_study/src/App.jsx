import { Link, Route, Routes } from "react-router-dom"
import First from "./First"
import Home from "./Home"

function App() {

  return (
    <>
      <h2>라우팅 연습</h2>
      <div>
        {/* to 속성에는 route 컴포넌트에 작성한 path와 동일한 정보를 작성 */}
        <Link to={""}>home</Link>
        <Link to={"/first"}>first</Link>
        <Link to={"/second"}>second</Link>
      </div>
      <Routes>
        <Route path="" element = {<Home/>}/>
        <Route path="/first/:age" element = {<First/>}/> {/* URL Parameter로 여러개 받을수 있음, 통상적으로 많이 사용하지않음 */} 
        <Route path="/second" element = {<div>두번째 페이지</div>}/>
        <Route path="/third" element = {<div>세번째 페이지</div>}/>
        <Route path="*" element = {<div>없는 페이지입니다</div>}/> {/* path="*" => 위에 적은 url 외에 입력시 */}
      </Routes>
      
    </>
  )
}

export default App
