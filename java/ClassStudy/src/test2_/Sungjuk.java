package test2_;

public class Sungjuk {
  private int korScore;
  private int engScore;
  private int mathScore;
  private int allScore;
  private int avr;

  public Sungjuk() {
  }

  public int getKorScore() {
    return korScore;
  }

  public void setKorScore(int korScore) {
    this.korScore = korScore;
  }

  public int getEngScore() {
    return engScore;
  }

  public void setEngScore(int engScore) {
    this.engScore = engScore;
  }

  public int getMathScore() {
    return mathScore;
  }

  public void setMathScore(int mathScore) {
    this.mathScore = mathScore;
  }

  public int getAllScore() {
    return korScore + engScore + mathScore;
  }

  public void setAllScore(int allScore) {
    this.allScore = allScore;
  }

  public double getAvr() {
    return getAllScore()/(double)3;
  }

  public void setAvr(int avr) {
    this.avr = avr;
  }

  public Sungjuk(int korScore, int engScore, int mathScore) {
    this.korScore = korScore;
    this.engScore = engScore;
    this.mathScore = mathScore;
  }

  public void setSungjuk(int korScore, int engScore, int mathScore){
    this.korScore = korScore;
    this.engScore = engScore;
    this.mathScore = mathScore;
  }

}

