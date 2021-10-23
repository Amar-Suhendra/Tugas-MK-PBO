
/**
 * Write a description of class main here.
 *
 * @author Amar Suhendra
 * @version 24.10.21.Alpha-06
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
    int posisi,ulang = 1;
    play = x;
    nama = user;
    tupai = squirrel;
    while (play) {

      KotakAngka map1 = new KotakAngka();
      Player player1 = new Player();
      posisi = map1.tambahSquirrel();;
      player1.SetNama(nama);
      map1.InsertMap();
      map1.PrintMap();
      System.out.println("Player : " + player1.getNama());
      System.out.println("Tupai  : " + player1.buatSquirrel(tupai));
      System.out.println("Posisi tupai pada : " + posisi);
      
      // check where the squirrel is 
      if (posisi > 1 && posisi < 50) {
        // If the squirrel's position is between 1-50, the maximum squirrel can jump 20 times.
        ulang = 20;
      } else if (posisi > 51 && posisi < 99) {
        // If the squirrel's position is between 51-99, the squirrel can jump a maximum of 10 times.
        ulang = 10;
      }
      System.out.println("kamu bisa melompat sebanyak : " + ulang);
      
      // loop for how many squirrels can jump
      // for (int i = 1; i <= ulang; i++) {

      //   System.out.println("\n");
      //   System.out.println("Tupai telah melompat sebanyak : "+(i-1));
      //   System.out.println("Squirrel is at number : " + posisi);

        // asking for input
      //   System.out.print("Jump to : ");
      //   posisi = Input.nextInt();

      //   // check user input 
      //   if ((acak == 10 && posisi == 11) || (acak == 11 && posisi == 10)) {
      //     System.out.println("You can only jump to adjacent place. Try again."+"\n");
      //   } else if ((acak == 20 && posisi == 21) || (acak == 21 && posisi == 20)) {
      //     System.out.println("You can only jump to adjacent place. Try again."+"\n");
      //   } else if ((acak == 30 && posisi == 31) || (acak == 31 && posisi == 30)) {
      //     System.out.println("You can only jump to adjacent place. Try again."+"\n");
      //   } else if ((acak == 40 && posisi == 41) || (acak == 41 && posisi == 40)) {
      //     System.out.println("You can only jump to adjacent place. Try again."+"\n");
      //   } else if ((acak == 50 && posisi == 51) || (acak == 51 && posisi == 50)) {
      //     System.out.println("You can only jump to adjacent place. Try again."+"\n");
      //   } else if ((acak == 60 && posisi == 61) || (acak == 61 && posisi == 60)) {
      //     System.out.println("You can only jump to adjacent place. Try again."+"\n");
      //   } else if ((acak == 70 && posisi == 71) || (acak == 71 && posisi == 70)) {
      //     System.out.println("You can only jump to adjacent place. Try again."+"\n");
      //   } else if ((acak == 80 && posisi == 81) || (acak == 81 && posisi == 80)) {
      //     System.out.println("You can only jump to adjacent place. Try again."+"\n");
      //   } else if ((acak == 90 && posisi == 91) || (acak == 91 && posisi == 90)) {
      //     System.out.println("You can only jump to adjacent place. Try again."+"\n");
      //   } else {
      //     cek = posisi - acak;
      //     if (cek == 10 || cek == -10 || cek == 1 || cek == -1) {
      //       acak = posisi;
      //       if (acak == 100) {
      //         i = ulang;
      //       }
      //     } else {
      //       System.out.println("You can only jump to adjacent place. Try again."+"\n");
      //     }
      //   }
      // }

      // // check if the squirrel's position is at 100
      // if (acak == 100) {
      //   System.out.println("|| Congratulation! Squirrel reaches its finish line at number 100. ||"+"\n");
      // } else {
      //   System.out.println("Game over! you lose");
      // }

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
