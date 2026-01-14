package Test2;

public class Acc {
  private String owner;
  private String accNumber;
  private int balnace;

  public Acc() {

  }

  public Acc(String owner, String accNumber, int balnace) {
    this.owner = owner;
    this.accNumber = accNumber;
    this.balnace = balnace;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public String getAccNumber() {
    return accNumber;
  }

  public void setAccNumber(String accNumber) {
    this.accNumber = accNumber;
  }

  public int getBalnace() {
    return balnace;
  }

  public void setBalnace(int balnace) {
    this.balnace = balnace;
  }

  @Override
  public String toString() {
    return "Acc{" +
            "owner='" + owner + '\'' +
            ", accNumber='" + accNumber + '\'' +
            ", balnace=" + balnace +
            '}';
  }
}
