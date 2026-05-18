//특정 메서드에만 제네릭 적용
public class GBox3 {
  public void aaa() {

  }

  //제네릭 문법이 적용된 메서드 -> 잘 사용안함 -> 와일드카드를 많이 사용함
  //매개변수로 객체가 전달되면 그 객체를 담고있는 상자를 리턴
  public <T> GBox<T> makeBox(T t){
    GBox<T> box = new GBox<>();
    box.set(t);
    return box;
  }

  //와일드카드
  public void bbb(GBox<?> t){

  }

  //와일드카드 + 상한 제한(개발자 실수 방지)
  public void ccc(GBox<? extends Phone> t){

  }

  //와일드카드 + 하한 제한(개발자 실수 방지)
  public void ddd(GBox<? super Phone> t){

  }

  //박스에 저장된 데이터를 읽기
  public void outBox(GBox<? extends Toy> box){
    Toy y = box.get();
    box.set(new Toy());
  }

  //박스에 저장된 데이터를 넣기
  public void InBox(GBox<? super Toy> box){
    Toy y = box.get();
    box.set(new Toy());
  }
}