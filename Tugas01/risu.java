/**
 * @author Amar Suhendra
 */
import java.lang.Math;
import java.util.Scanner;

public class risu {

  public static void Menu() {
    System.out.println("+=====================================================================+");
    System.out.println("|  1   |  2   |  3   |  4   |  5   |  6   |  7   |  8   |  9   |  10  |");
    System.out.println("|  11  |  12  |  13  |  14  |  15  |  16  |  17  |  18  |  19  |  20  |");
    System.out.println("|  21  |  22  |  23  |  24  |  25  |  26  |  27  |  28  |  29  |  30  |");
    System.out.println("|  31  |  32  |  33  |  34  |  35  |  36  |  37  |  38  |  39  |  40  |");
    System.out.println("|  41  |  42  |  43  |  44  |  45  |  46  |  47  |  48  |  49  |  50  |");
    System.out.println("|  51  |  52  |  53  |  54  |  55  |  56  |  57  |  58  |  59  |  60  |");
    System.out.println("|  61  |  62  |  63  |  64  |  65  |  66  |  67  |  68  |  69  |  70  |");
    System.out.println("|  71  |  72  |  73  |  74  |  75  |  76  |  77  |  78  |  79  |  80  |");
    System.out.println("|  81  |  82  |  83  |  84  |  85  |  86  |  87  |  88  |  89  |  90  |");
    System.out.println("|  91  |  92  |  93  |  94  |  95  |  96  |  97  |  98  |  99  |  100 |");
    System.out.println("+=====================================================================+");
  }

  public static void main(String[] args) {
    int[][] map = new int[10][10]; // array
    int k = 1, acak, min = 1, max = 99; // variables
    int posisi = 0, risu, cek;
    Scanner Input = new Scanner(System.in); // user input
    Menu(); // the menu
    acak = (int) (min + Math.random() * (max - min)); // for random position

    for (int i = 0; i < map.length; i++) { // insert number to the array
      for (int j = 0; j < map.length; j++) {
        map[i][j] = k;
        k++;
      }
    }
    
    System.out.println(acak);


  }
}