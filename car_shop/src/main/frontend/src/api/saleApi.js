import axios from "axios"

/**
 * 판매 정보 등록
 * @param {*} data 
 * @returns 
 */
export const regSale = async (data) => {
  try{
    const response = await axios.post('http://localhost:8080/sales', data)
    return response
  }catch(e){
    console.log('판매 정보 등록 실패', e)
  }
}

export const getSales = async () => {
  try{
    const response = await axios.get('http://localhost:8080/sales')
    return response
  }catch(e){
    console.log('판매 목록 조회 실패', e)
  }
}