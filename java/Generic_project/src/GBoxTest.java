import java.util.ArrayList;
import java.util.List;

public class GBoxTest {
  public static void main(String[] args) {
    GBox<Orange> b1 = new GBox<Orange>();
    b1.set(new Orange());
    Orange o = b1.get();

    List<Orange> list = new ArrayList<>();
    GBox<Apple> b2 = new GBox<>();
    b2.set(new Apple());
    Apple a = b2.get();

    GBox2<Phone> g1 = new GBox2<>();
    GBox2<Smartphone> g2 = new GBox2<>();

    GBox3 box3 = new GBox3();

    GBox<Orange> ob = box3.<Orange>makeBox(new Orange());
  }
}
