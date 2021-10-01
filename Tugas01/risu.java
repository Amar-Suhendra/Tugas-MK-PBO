/**
 * @author Amar Suhendra
 * @version 1.10.21.Aplha-1.0
 * https://github.com/Amar-Suhendra/Tugas-MK-PBO/tree/main/Tugas01
 */
import java.lang.Math;
import java.util.Scanner;

public class risu {

  public static void main(String[] args) {
    
    int[][] map = new int[10][10]; // array
    int k = 1, acak, min = 1, max = 99; // variables
    int posisi = 0, ulang = 0, cek;
    Scanner Input = new Scanner(System.in); // user input

    acak = (int) (min + Math.random() * (max - min)); // for random position

    for (int i = 0; i < map.length; i++) { // insert number to the array
      for (int j = 0; j < map.length; j++) {
        map[i][j] = k;
        k++;
      }
    }
    
    System.out.println("=====================================================");
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map.length; j++) {
        System.out.printf("%5d",map[i][j]);
        if (j == 9) {
          System.out.print("\n");
        }
      }
    }
    System.out.println("=====================================================");

    if (acak > 1 && acak < 51) {
      ulang = 20;
    } else if (acak > 51 && acak < 99 ) {
      ulang = 10;
    }

    for (int i = 0; i <= ulang; i++) {
      System.out.println("Squirrel is at number : "+ acak);
      System.out.print("Jump to : " );
      posisi = Input.nextInt();
      
      if ((acak == 10 && posisi == 11) || (acak == 11 && posisi == 10) ) {
        System.out.println("You can only jump to adjacent place. Try again.");
      }else if((acak == 20 && posisi == 21) || (acak == 21 && posisi == 20)){
        System.out.println("You can only jump to adjacent place. Try again.");
      }else if((acak == 30 && posisi == 31) || (acak == 31 && posisi == 30)){
        System.out.println("You can only jump to adjacent place. Try again.");
      }else if((acak == 40 && posisi == 41) || (acak == 41 && posisi == 40)){
        System.out.println("You can only jump to adjacent place. Try again.");
      }else if((acak == 50 && posisi == 51) || (acak == 51 && posisi == 50)){
        System.out.println("You can only jump to adjacent place. Try again.");
      }else if((acak == 60 && posisi == 61) || (acak == 61 && posisi == 60)){
        System.out.println("You can only jump to adjacent place. Try again.");
      }else if((acak == 70 && posisi == 71) || (acak == 71 && posisi == 70)){
        System.out.println("You can only jump to adjacent place. Try again.");
      }else if((acak == 80 && posisi == 81) || (acak == 81 && posisi == 80)){
        System.out.println("You can only jump to adjacent place. Try again.");
      }else if((acak == 90 && posisi == 91) || (acak == 91 && posisi == 90)){
        System.out.println("You can only jump to adjacent place. Try again.");
      }else{
        cek = posisi - acak;
        if (cek == 10 || cek == -10 || cek == 1 || cek == -1) {
          acak = posisi;
          if(acak == 100){
            i = ulang;
          }
        } else {
          System.out.println("You can only jump to adjacent place. Try again.");
        }
      }
    }
    if (acak == 100) {
      System.out.println("Congratulation! Squirrel reaches its finish line at number 100.");
    } else {
      System.out.println("Game over! you lose");
    }
  }
}