/**
 * Write a description of class Player here.
 *
 * @author Amar Suhendra
 * @version 24.10.21.Alpha-07
 */
public class Player {
  // instance variables - replace the example below with your own
  private String nama;
  private int nilai;


  /**
   * Constructor for objects of class Player
   */
  public Player() {

  }

  public Player(String nama) {
    // initialise instance variables
    this.nama = nama;
  }

  /**
   * An example of a method - replace this comment with your own
   *
   * @param y a sample parameter for a method
   * @return the sum of x and y
   */
  public String getNama() {
    // put your code here
    return nama;
  }

  public void SetNama(String nama) {
    // put your code here
    this.nama = nama;
  }

  public int getNilai() {
    return nilai;
  }

  public int setNilai(int nilaibaru) {
    nilai = nilaibaru;

    return nilai;
  }

  public String buatSquirrel(String bajing) {
    return bajing;
  }

  public int lompat(String jump) {
    int jarak = 10;

    return jarak;
  }
}
