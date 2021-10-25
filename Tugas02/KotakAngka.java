/**
 * This class is used for print "kotak" for the game and give random value.
 * 
 * @author Amar Suhendra
 * @version 25.10.21.Beta-01
 */

public class KotakAngka {
  // instance variables
  private int jumlahKotak, min, max, posisi;
  private int[][] kotak;

  /**
   * Constructor for objects of class KotakAngka
   */
  public KotakAngka() {
    // initialise instance variables
    kotak = new int[10][10];
    jumlahKotak = 1;
    min = 1;
    max = 99;
    posisi = 0;
  }

  /**
   * This method will insert a value to the array variable
   */
  public void insertMap() {
    for (int i = 0; i < kotak.length; i++) {
      for (int j = 0; j < kotak.length; j++) {
        kotak[i][j] = jumlahKotak;
        jumlahKotak++;
      }
    }
  }

  /**
   * This method will print the array
   */
  public void printMap() {
    System.out.println("=====================================================");
    for (int i = 0; i < kotak.length; i++) {
      for (int j = 0; j < kotak.length; j++) {
        System.out.printf("%5d", kotak[i][j]);
        if (j == 9) {
          System.out.print("\n");
        }
      }
    }
    System.out.println("=====================================================");
  }

  /**
   * This method will give a random number
   * 
   * @return random number from 1 to 99
   */
  public int tambahSquirrel() {
    posisi = (int) (min + Math.random() * (max - min));
    return posisi;
  }
}