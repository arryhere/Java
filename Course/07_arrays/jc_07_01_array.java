
public class jc_07_01_array {

  public static void array() {
    int[] int_array = new int[5];
    int_array[0] = 0;
    int_array[1] = 1;
    int_array[2] = 2;
    int_array[3] = 3;
    int_array[4] = 4;
    // int_array[5] = 4; // error - Index 5 out of bounds for length 5

    for (int i = 0; i < int_array.length; i++) {
      System.out.println(int_array[i]);
    }
  }

  public static void main(String[] args) {
    array();
  }
}