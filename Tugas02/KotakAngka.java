/**
 * Using to print the Map for the game 
 *
 * @author Amar Suhendra
 * @version 23.10.21.Alpha-04
 */
public class KotakAngka
{
    // instance variables - replace the example below with your own
    private int[][] map;
    private int angka;

    /**
     * Constructor for objects of class Map
     */
    public KotakAngka()
    {
        // initialise instance variables
        map = new int[10][10];
        angka = 1;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public void InsertMap(){
        // insert number into array
        for (int i = 0; i < map.length; i++) {
          for (int j = 0; j < map.length; j++) {
            map[i][j] = angka;
            angka++;
          }
        }
    }
    
    public void PrintMap(){
        // this code gonna print the array as a table
        System.out.println("=====================================================");
        for (int i = 0; i < map.length; i++) {
          for (int j = 0; j < map.length; j++) {
            System.out.printf("%5d", map[i][j]);
             if (j == 9) {
             System.out.print("\n");
            }
          }
        }
       System.out.println("=====================================================");
    }
    
}
