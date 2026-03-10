
//게시판 테이블과 관련된 api 요청을 보내는 함수 모음 파일

import axios from "axios";

//게시글 목록 조회 api 요청함수

/**
 * 검색창이 비었을때 전체 게시글 목록 조회 함수
 * @param {string} search 검색내용 
 * @returns {Promise} or 게시글 목록 데이터 리턴
 */
export const getList = async (search) => {
  try{
    const result = await axios.get('http://localhost:8080/boards',search);
    return result;
  }catch(e){
    console.log(e);
  }
}

export const save =  async (data) => {
  try{
    const response = await axios.post('http://localhost:8080/boards', data)
    return response;
  }catch(e){
    console.log(e)
  }
}

/**
 * 게시글 삭제
 * @param {number} boardNum 삭제할 게시글 번호 
 * @returns 
 */
export const delBoard = async (boardNum) => {
  try{
    const response = await axios.delete(`http://localhost:8080/boards/${boardNum}`)
    return response;
  }catch(e){
    console.log(e)
  }
}