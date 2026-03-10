import { Route, Routes } from "react-router-dom"
import BasicLayout from "./components/layout/basicLayout"
import './reset.css'
import RegCar from "./pages/RegCar"



function App() {

  return (
    <Routes>
      <Route path="/" element={<BasicLayout/>}>
        <Route path="reg" element={<RegCar/>} />
      </Route>
    </Routes>
  )
}

export default App
