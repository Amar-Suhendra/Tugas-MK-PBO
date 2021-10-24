/**
 * Write a description of class Player here.
 *
 * @author Amar Suhendra
 * @version 24.10.21.Alpha-09
 */
public class Player {
  // instance variables - replace the example below with your own
  private String nama;
  private int nilai;
  private int jarak;

  /**
   * Constructor for objects of class Player
   */
  public Player() {
    jarak = 0;
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

  public void setNilai(int nilaibaru) {
    nilai = nilaibaru;
  }

  public String buatSquirrel(String bajing) {
    return bajing;
  }

  public int lompat(String jump) {

    if (jump.equalsIgnoreCase("kanan")) {
      jarak = 1;
    } else if (jump.equalsIgnoreCase("kiri")) {
      jarak = -1;
    } else if (jump.equalsIgnoreCase("atas")) {
      jarak = -10;
    } else if (jump.equalsIgnoreCase("bawah")) {
      jarak = 10;
    } else {
      jarak = 0;
    }

    return jarak;
  }
}
