//기본 함수 선언 문법
function hello(){
  console.log('hello');
}

//함수 표현식 사용
const hello2 = function (){
  console.log('hello');
}

//화살표 함수

const hello3 = () => {
  console.log('hello');
}

//화살표 함수
//만약 매개변수가 하나라면 소괄호 생략 가능
//만약 함수 안의 실행내용이 한 줄이라면 중괄호 생략 가능
//만약 실행 내용이 한 줄이고 + 그 한 줄이 return문이라면
//중괄호 생략과 함께 return 키워드도 생략해야 함!