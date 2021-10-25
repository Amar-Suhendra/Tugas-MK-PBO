/**
 * This is main class 
 * 
 * @author amar Suhendra
 * @version 25.10.21.Beta-01
 */
import java.util.Scanner;

public class MainSquirrelJump {

  /**
   * This method will print the main menu
   */
  public static void mainMenu() {
    System.out.println("+============== MAIN MENU ==============+");
    System.out.println("|               1. play                 |");
    System.out.println("|               2. Tutorial             |");
    System.out.println("|               3. Exit                 |");
    System.out.println("+=======================================+");
    System.out.print("Pilihan mu (1/2/3) : ");
  }

  /**
   * This method will run if player chooses to play
   * 
   * @param main     receive the boolean from user
   * @param user     user name
   * @param squirrel user's squirrel name
   */
  public static void mainkan(boolean main, String user, String squirrel) {
    // declaration variables and give a parameter value to variables
    Scanner action = new Scanner(System.in);
    int posisi, ulang = 1, jarak = 0, score = 100;
    boolean play = main;
    String nama = user, tupai = squirrel, lompat;

    // run the game
    while (play) {

      // make an object
      KotakAngka map1 = new KotakAngka();
      Player player1 = new Player();

      // set player name
      player1.setNama(nama);

      // insert number to map and print the map
      map1.insertMap();
      map1.printMap();

      // get random position for squirrel
      posisi = map1.tambahSquirrel();

      // print player name and squirrel name
      System.out.println("Player : " + player1.getNama());
      System.out.println("Tupai  : " + player1.buatSquirrel(tupai));

      // check where the squirrel is
      if (posisi > 1 && posisi < 50) {
        // if the squirrel's position is between 1-50, the maximum squirrel can jump 20
        // times
        ulang = 20;
      } else if (posisi > 51 && posisi < 99) {
        // if the squirrel's position is between 1-50, the maximum squirrel can jump 10
        // times
        ulang = 10;
      }

      // print how many the squirrel can jump
      System.out.println("kamu bisa melompat sebanyak : " + ulang);

      // loop for many squirrel can jump
      for (int i = ulang; i >= 0; i--) {
        System.out.println("\nSisa lompatan mu  : " + i);
        System.out.println("Tupai pada posisi : " + posisi);

        // asking for input
        System.out.print("Lompat ke (kiri, kanan, atas, bawah) : ");
        lompat = action.nextLine();
        jarak = player1.lompat(lompat);

        if (jarak == 0) {
          score -= 5;
        }

        // checking
        if ((posisi == 10 && jarak == 1) || (posisi == 11 && jarak == -1)) {
          score -= 5;
          System.out.println("\nYou can only jump to adjacent place. Try again.");
        } else if ((posisi == 20 && jarak == 1) || (posisi == 21 && jarak == -1)) {
          score -= 5;
          System.out.println("\nYou can only jump to adjacent place. Try again.");
        } else if ((posisi == 30 && jarak == 1) || (posisi == 31 && jarak == -1)) {
          score -= 5;
          System.out.println("\nYou can only jump to adjacent place. Try again.");
        } else if ((posisi == 40 && jarak == 1) || (posisi == 41 && jarak == -1)) {
          score -= 5;
          System.out.println("\nYou can only jump to adjacent place. Try again.");
        } else if ((posisi == 50 && jarak == 1) || (posisi == 51 && jarak == -1)) {
          score -= 5;
          System.out.println("\nYou can only jump to adjacent place. Try again.");
        } else if ((posisi == 60 && jarak == 1) || (posisi == 61 && jarak == -1)) {
          score -= 5;
          System.out.println("\nYou can only jump to adjacent place. Try again.");
        } else if ((posisi == 70 && jarak == 1) || (posisi == 71 && jarak == -1)) {
          score -= 5;
          System.out.println("\nYou can only jump to adjacent place. Try again.");
        } else if ((posisi == 80 && jarak == 1) || (posisi == 81 && jarak == -1)) {
          score -= 5;
          System.out.println("\nYou can only jump to adjacent place. Try again.");
        } else if ((posisi == 90 && jarak == 1) || (posisi == 91 && jarak == -1)) {
          score -= 5;
          System.out.println("\nYou can only jump to adjacent place. Try again.");
        } else {
          posisi += jarak;
          if (posisi == 100) {
            i = 0;
          }
        }
      }

      // check if the squirrel's position is at 100
      if (posisi == 100) {
        player1.setNilai(score);
        System.out.println("\n|| SELAMAT! KAMU MENANG.||");
        System.out.println("Score kamu : " + player1.getNilai() + "\n");
      } else {
        System.out.println("\n|| YAHH! KAMU KALAH. ||" + "\n");
      }

      play = false;
    }
  }

  /**
   * Main method
   * 
   * @param args
   */
  public static void main(String[] args) {
    // declaration variables
    boolean main = true, chooise = true;
    String nama, namaTupai;
    int pilih;
    Scanner input = new Scanner(System.in);
    Scanner user = new Scanner(System.in);

    // run the game
    while (chooise) {
      // show then main menu
      mainMenu();

      // asking for input
      pilih = input.nextInt();

      // checking the input
      if (pilih == 1) {
        // asking for player name
        System.out.print("\nMasukkan namamu : ");
        nama = user.nextLine();

        // asking for squirrel name
        System.out.print("Masukkan nama Tupaimu  : ");
        namaTupai = user.nextLine();
        System.out.println();
        // run the method
        mainkan(main, nama, namaTupai);
      } else if (pilih == 2) {
        // show tutorial
        System.out.println("+=============== Tutorial ==============+");
        System.out.println("| 1. Untuk menggerakkan tupai dapat     |");
        System.out.println("| menggunakan perintah 'kanan', 'kiri', |");
        System.out.println("| 'atas', atau 'bawah'.                 |");
        System.out.println("| 2. Raih posisi tupai pada angka 100   |");
        System.out.println("| untuk menang.                         |");
        System.out.println("+=======================================+");
      } else if (pilih == 3) {
        // exit
        System.out.println("\nExit the program\n");
        chooise = false;
      } else {
        System.out.println("Inputan mu tidak valid");
      }

    }

  }
}