
/**
 * Write a description of class main here.
 *
 * @author Amar Suhendra
 * @version 23.10.21.Alpha-05
 */

import java.util.Scanner;

public class MainSquirrelJump {
  /**
   * An example of a method - replace this comment with your own
   *
   * @param y a sample parameter for a method
   * @return the sum of x and y
   */

  public static void Mainkan(boolean x, String user, String squirrel) {
    boolean play;
    String nama;
    String tupai;
    play = x;
    nama = user;
    tupai = squirrel;
    while (play) {

      KotakAngka map1 = new KotakAngka();
      Player player1 = new Player();
      player1.SetNama(nama);
      map1.InsertMap();
      map1.PrintMap();
      player1.buatSquirrel(tupai);
      System.out.println("Player : " + player1.getNama());
      play = false;
    }
  }

  public static void mainMenu() {
    System.out.println("+=========== MAIN MENU ===============+");
    System.out.println("|             1. play                 |");
    System.out.println("|             2. Tutorial             |");
    System.out.println("|             3. Exit                 |");
    System.out.println("+=====================================+");
    System.out.print("Pilihan mu (1/2/3) : ");
  }

  public static void main(String[] args) {

    boolean main = true, chooise = true;
    String nama, namaTupai;
    int pilih;
    Scanner input = new Scanner(System.in);
    Scanner user = new Scanner(System.in);

    //while (chooise) {
      mainMenu();
      pilih = input.nextInt();

      if (pilih == 1) {
        System.out.print("Masukkan namamu : ");
        nama = user.nextLine();
        System.out.print("Masukkan nama Tupaimu  : ");
        namaTupai = user.nextLine();
        Mainkan(main, nama, namaTupai);
      } else if (pilih == 2) {
        System.out.println("tutorial");
      } else if (pilih == 3) {
        chooise = false;
      } else {
        System.out.println("Inputan mu tidak valid");
      }

    //}

    //input.close();
    //user.close();
  }
}
