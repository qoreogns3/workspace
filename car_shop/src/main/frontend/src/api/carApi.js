import axios from "axios"

/**
 * 차량 등록
 * @param {*} data 
 * @returns 
 */
export const regCar = async(data) => {
  try{
    const response = await axios.post('http://localhost:8080/cars', data)
    return response;
  }catch(e){
    console.log('차량 등록 실패', e)
  }
}

export const getCars = async() => {
  try{
    const response = await axios.get('http://localhost:8080/cars')
    return response;
  }catch(e){
    console.log('차량 조회 실패', e)
  }
}