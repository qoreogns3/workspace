import { Route, Routes } from "react-router-dom"
import BasicLayout from "./components/layout/basicLayout"
import './reset.css'
import RegCar from "./pages/RegCar"
import RegSale from "./pages/RegSale"
import SaleList from "./pages/SaleList"
import Home from "./pages/Home"



function App() {

  return (
    <Routes>
      <Route path="/" element={<BasicLayout/>}>
        <Route path="" element={<Home/>} />
        <Route path="reg" element={<RegCar/>} />
        <Route path="sale" element={<RegSale/>}/>
        <Route path="list" element={<SaleList/>}/>
      </Route>
    </Routes>
  )
}

export default App
