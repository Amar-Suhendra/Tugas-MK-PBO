/**
 * This class is used for configure the player, player controller, and add
 * squirrel.
 * 
 * @author Amar Suhendra
 * @version 25.10.21.Beta-01
 */

public class Player {
  // instance variables
  private String nama;
  private int nilai, jarak;

  /**
   * Constructor for objects of class Player
   */
  public Player() {
    nama = "player";
    jarak = 0;
    nilai = 0;
  }

  /**
   * Set the Player name
   * 
   * @param nama parameter for setNama
   */
  public void setNama(String nama) {
    this.nama = nama;
  }

  /**
   * Get the Player name
   * 
   * @return the value of nama variable
   */
  public String getNama() {
    return nama;
  }

  /**
   * Set the value
   * 
   * @param nilaibaru parameter for setNilai
   */
  public void setNilai(int nilaibaru) {
    nilai = nilaibaru;
  }

  /**
   * Get the value
   * 
   * @return the value of nilai variable
   */
  public int getNilai() {
    return nilai;
  }

  /**
   * Make a tupai
   * 
   * @param tupai parameter for buatSquirrel
   * @return the value of tupai variable
   */
  public String buatSquirrel(String tupai) {
    return tupai;
  }

  /**
   * This is used to find out which direction the player is moving
   * 
   * @param jump parameter for lompat
   * @return the value of jarak variable
   */
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