const getStuList = () => {
  classNum = document.querySelector("#classNum").value;

  location.href = `/stus/getClass?classNum=${classNum}`;
  
};

const asyncGetList = () => {
  //그려진 점수 그림을 지움
  document.querySelector('#score_table').innerHTML = '';

  classNum = document.querySelector("#classNum").value;
  axios.get(`/stus/list?classNum=${classNum}`)
  .then(response => {
    console.log(response.data)
    //조회한 데이터로 다시 그린다 
    // 1. 그림을 다시 그릴 태그를 선택한다
    const tbody_tag = document.querySelector("#list_table > tbody")

    // 2. 기존 태그 지우기
    tbody_tag.innerHTML = '';
    
    // 3. 새 그림을 문자열로 만든다
    let str = ``
    let i = 0
    for(const stu of response.data){
      str += `
        <tr>
          <td>${response.data.length - i}</td>
          <td>${stu.stuNum}</td>
          <td>
            <div
              onClick="asyncGetScore(${stu.stuNum})"
            >${stu.stuName}</div>
          </td>
          <td>${stu.stuYear}</td>
          <td>${stu.classNum}</td>
          <td>${stu.classDTO.className}</td>
        </tr>
      `
      i++
    }

    // 4. 붙이기
    tbody_tag.insertAdjacentHTML("afterbegin", str)
  })
  .catch(e => console.log(e))
}

const asyncGetScore = (num) => {
  console.log(num)
  axios.get(`/stus/score?stuNum=${num}`)
  .then(response => {
    console.log(response.data)
    const score = response.data
    const tbody_tag = document.querySelector("#score_table")
    let abc = 0
    
    tbody_tag.innerHTML = '';
    const str = `
      <form action="/stus/update" method="post">
        <table border="1">
          <thead>
            <tr>
              <td>학생명</td>
              <td>국어점수</td>
              <td>영어점수</td>
              <td>수학점수</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>${score.stuDTO.stuName}</td>
              <td>
                <input 
                  type="text"
                  name="korScore"
                  value=${score.korScore}
                >
              </td>
              <td>
                <input 
                  type="text"
                  name="engScore"
                  value=${score.engScore}
                >
              </td>
              <td>
                <input 
                  type="text"
                  name="mathScore"
                  value=${score.mathScore}
                >
              </td>
            </tr>
          </tbody>
        </table>
        <input type="hidden" name="stuNum" value=${score.stuNum}>
        <input type="hidden" name="scoreNum" value=${score.scoreNum}>
        <button type="submit">수정</button>
        <button
          type="button"
          onClick={console.log(${abc})} 
        >클릭
        </button>
      </form>
    `

    tbody_tag.insertAdjacentHTML("afterbegin", str)
  })
  .catch(e => console.log(e))
}