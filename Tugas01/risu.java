/**
 * @author Amar Suhendra
 * @version 2.10.21.1.5
 * 
 * Gdrive link : https://drive.google.com/drive/folders/1LBU1mlo6f7C9q0eCy7IychSQjg-9ougo?usp=sharing
 * 
 * Github link : https://github.com/Amar-Suhendra/Tugas-MK-PBO/tree/main/Tugas01
 */

/**
 * using import java.lang.Math; for random number
 * using import java.util.Scanner; for scanner 
 * using import import java.lang.String; for string commparison
 */

import java.lang.Math;
import java.util.Scanner;
import java.lang.String;

public class risu {
  public static void main(String[] args) {
    /**
     * ======= variables explanation =======
     * int[][] Map is used to store array 
     * int angka is used to store number and the value will be stored in array Map
     * int acak is used to store random number and Squirrel's position 
     * int min is used to set minimum range for random method
     * int max is used to set maximum range for random method
     * int posisi is used to store the number inputted by the user
     * int ulang is used to store the value to be used how many loops to do
     * int cek is used to store the result of the difference between the distance between the squirrel's position and the jump 
     * boolean Kondisi is used to checking the loop
     * boolean Kondisi2 is used to checking the loop
     * String pilihan is used to store the string inputted by the user
     * Scanner Input is used to store user input
     */

    int[][] Map = new int[10][10];
    int angka = 1, acak, min = 1, max = 99, posisi = 0, ulang = 0, cek; 
    boolean kondisi = true, kondisi2 = true;
    String pilihan;
    Scanner Input = new Scanner(System.in); 
    
    // insert number into array
    for (int i = 0; i < Map.length; i++) {
      for (int j = 0; j < Map.length; j++) {
        Map[i][j] = angka;
        angka++;
      }
    }

    // looping for " play again or quit" 
    while (kondisi) {
      // generate random number for Squirrel position 
      acak = (int) (min + Math.random() * (max - min)); 

      // this code gonna print the array as a table
      System.out.println("=====================================================");
      for (int i = 0; i < Map.length; i++) {
        for (int j = 0; j < Map.length; j++) {
          System.out.printf("%5d", Map[i][j]);
          if (j == 9) {
            System.out.print("\n");
          }
        }
      }
      System.out.println("=====================================================");

      // check where the squirrel is 
      if (acak > 1 && acak < 50) {
        // If the squirrel's position is between 1-50, the maximum squirrel can jump 20 times.
        ulang = 20;
      } else if (acak > 51 && acak < 99) {
        // If the squirrel's position is between 51-99, the squirrel can jump a maximum of 10 times.
        ulang = 10;
      }
      System.out.println("kamu bisa melompat sebanyak : " + ulang);
      
      // loop for how many squirrels can jump
      for (int i = 1; i <= ulang; i++) {

        System.out.println("\n");
        System.out.println("Tupai telah melompat sebanyak : "+(i-1));
        System.out.println("Squirrel is at number : " + acak);

        // asking for input
        System.out.print("Jump to : ");
        posisi = Input.nextInt();

        // check user input 
        if ((acak == 10 && posisi == 11) || (acak == 11 && posisi == 10)) {
          System.out.println("You can only jump to adjacent place. Try again."+"\n");
        } else if ((acak == 20 && posisi == 21) || (acak == 21 && posisi == 20)) {
          System.out.println("You can only jump to adjacent place. Try again."+"\n");
        } else if ((acak == 30 && posisi == 31) || (acak == 31 && posisi == 30)) {
          System.out.println("You can only jump to adjacent place. Try again."+"\n");
        } else if ((acak == 40 && posisi == 41) || (acak == 41 && posisi == 40)) {
          System.out.println("You can only jump to adjacent place. Try again."+"\n");
        } else if ((acak == 50 && posisi == 51) || (acak == 51 && posisi == 50)) {
          System.out.println("You can only jump to adjacent place. Try again."+"\n");
        } else if ((acak == 60 && posisi == 61) || (acak == 61 && posisi == 60)) {
          System.out.println("You can only jump to adjacent place. Try again."+"\n");
        } else if ((acak == 70 && posisi == 71) || (acak == 71 && posisi == 70)) {
          System.out.println("You can only jump to adjacent place. Try again."+"\n");
        } else if ((acak == 80 && posisi == 81) || (acak == 81 && posisi == 80)) {
          System.out.println("You can only jump to adjacent place. Try again."+"\n");
        } else if ((acak == 90 && posisi == 91) || (acak == 91 && posisi == 90)) {
          System.out.println("You can only jump to adjacent place. Try again."+"\n");
        } else {
          cek = posisi - acak;
          if (cek == 10 || cek == -10 || cek == 1 || cek == -1) {
            acak = posisi;
            if (acak == 100) {
              i = ulang;
            }
          } else {
            System.out.println("You can only jump to adjacent place. Try again."+"\n");
          }
        }
      }

      // check if the squirrel's position is at 100
      if (acak == 100) {
        System.out.println("|| Congratulation! Squirrel reaches its finish line at number 100. ||"+"\n");
      } else {
        System.out.println("Game over! you lose");
      }
      
      while (kondisi2) {
        // asking for input
        System.out.print("Do you still want to play? (type y to yes or type q to quit) : ");
        pilihan = Input.next();

        // check user input
        if (pilihan.equalsIgnoreCase("y")) {
          kondisi = true;
          kondisi2 = false;
        } else if(pilihan.equalsIgnoreCase("q")) {
          kondisi = false;
          kondisi2 = false;
        }else{
          System.out.println("Your input is not identified, please input again"+"\n");
        }
      }

    }

  }
}