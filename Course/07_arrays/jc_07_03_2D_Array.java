/*
• Java Multi-Dimensional Arrays
• A multidimensional array is an array of arrays
• To create a two-dimensional array, add each array within its own set of curly braces
• [ [1,2,3], [4,5,6], [7,8,9] ]
• 
*/

import java.util.Arrays;

public class jc_07_03_2D_Array {

  public static void array2D() {
    int[][] array2D = new int[3][3];

    array2D[0][0] = 1;
    array2D[0][1] = 2;
    array2D[0][2] = 3;

    array2D[1][0] = 4;
    array2D[1][1] = 5;
    array2D[1][2] = 6;

    array2D[2][0] = 7;
    array2D[2][1] = 8;
    array2D[2][2] = 9;

    System.out.println("[ " + Arrays.toString(array2D[0]) + ", " + Arrays.toString(array2D[1]) + ", "
        + Arrays.toString(array2D[2]) + " ]");
  }

  public static void moreArray2D() {
    char[][] moreArray2D = {
        { 'a', 'b', 'c', 'd' },
        { 'e', 'f', 'g', 'h' },
        { 'i', 'j', 'k', 'l' },
    };

    for (int i = 0; i < moreArray2D.length; i++) {
      for (int j = 0; j < moreArray2D[i].length; j++) {
        System.out.print(moreArray2D[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    array2D();
    moreArray2D();
  }
}