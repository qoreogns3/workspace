import java.util.Arrays;

public class Song {
  String title;
  String artist;
  String album;
  int year;
  String[] composer = new String[3];

  public void setSong(String title1, String artist1, String album1, int year1, String[] composer1){
    title = title1;
    artist = artist1;
    album = album1;
    year = year1;
    composer = composer1;
  }

  public void printAllData(){
    System.out.println("title : " + title);
    System.out.println("artist : " + artist);
    System.out.println("album : " + album);
    System.out.println("year : " + year);
//    System.out.println("composer : " + Arrays.toString(composer));
    System.out.print("composer : ");
    for (int i  = 0; 1 < composer.length; i++){
      System.out.print(composer[i]+" ");
    }
  }

}
