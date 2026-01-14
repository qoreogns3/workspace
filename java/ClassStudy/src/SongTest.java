public class SongTest {
  public static void main(String[] args) {

    Song s1 = new Song();

    String[] a = {"김", "이", "박"};
    s1.setSong("가시", "버즈", "1집", 2024, a);

    s1.printAllData();
  }
}
