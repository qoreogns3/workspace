


//interface 안에는 메서드의 정의만 들어올 수 있음
//중요한 것은 메서드의 내용부가 없다는 것이다. -> 추상메서드
//interface 안에는 멤버변수 사용 못함, 생성자도 없음
//interface는 생성자가 없기 떄문에 객체 생성 x
//interface에서는 메서드의 접근제한자가 자동으로 public이 붙음
public interface Vending {
  //커피 뽑는 기능
  void getCoffee();

  //우유 뽑는 기능
  void getMilk();

  //돈 넣는 기능
  void pay();

}
