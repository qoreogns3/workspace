package board;

public class BoardService {

  //매개변수로 전달된 두 게시글 객체 중에서
  //글 번호가 큰 게시글의 제목을 리턴하는 메서드

  public String test1(Board b1, Board b2){
    if (b1.getBoardNum() > b2.getBoardNum()){
      return b1.getTitle();
    }
    else {
      return b2.getTitle();
    }

//    return b1.getBoardNum() > b2.getBoardNum() ? b1.getBoardNum() : b2.getBoardNum();
  }

  //매개변수로 게시글 객체 두개가 전달되면
  //해당 게시글의 조회수의 합을 리턴

  public int test2(Board b1, Board b2){
    return b1.getReadCnt()+b2.getReadCnt();
  }

  //매개변수로 글번호, 제목이 전달되면
  //해당 데이터를 갖는 게시글 객체를 리턴하는 메서드

  public Board test3(int num, String title){
    Board b = new Board(num, title,"bb",10);
    return b;

//    return new Board(num, title, "bb", 10);
  }

  //매개변수로 두개의 게시글 객체가 전달되면
  //두 객체 중 글번호가 큰 게시글을 리턴하는 메서드

  public Board test4(Board b1, Board b2){
    if(b1.getBoardNum() > b2.getBoardNum()){
      return b1;
    }

    else{
      return b2;
    }
  }

  //매개변수로 게시글 객체가 여러개 전달되면
  //매개변수로 전달된 게시글 중 글 번호가 짝수인 게시글만 리턴하는 메서드

  public Board[] test5(Board[] arr) {

    int cnt = 0;
    for (Board e : arr) {
      if (e.getBoardNum() % 2 == 0) {
        cnt++;
      }
    }

    Board[] result = new Board[cnt];
    int a = 0;
    for (Board e : arr) {
      if (e.getBoardNum() % 2 == 0) {
        result[a++] = e;
      }
    }
    return result;

//    Board[] arr1 = new Board[arr.length / 2];
//    int a = 0;
//    for (int i = 0; i < arr.length; i++){
//      if (arr[i].getBoardNum() % 2 == 0){
//        arr1[a++] = arr[i];
//      }
//    }
//    return arr1;
//
  }
}

