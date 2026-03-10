import axios from "axios";

export const replysList = async (num) => {
  try{
    const response = await axios.get(`http://localhost:8080/boards/reply/${num}`)
    return response;
  }catch(e){
    console.log(e)
  }
}

/**
 * 댓글 등록 함수
 * @param {number} num 
 * @param {object} reply 
 * @param {string} reply.writer 
 * @param {string} reply.content 
 */
export const saveReply = async (num, reply) => {
  try{
    await axios.post(`http://localhost:8080/boards/reply/${num}`, reply)
  }catch(e){
    console.log(e)
  }
}

export const delReply = async(num) => {
  try{
    await axios.delete(`http://localhost:8080/boards/reply/${num}`)
  }catch(e){
    console.log(e)
  }
  
}