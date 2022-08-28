
import java.util.Arrays;

public class jc_07_02_array_datatypes {

  public static void arrayDatatypes() {
    int[] int_array = { 1, 2, 3, 4, 5 };
    double[] double_array = { 1.1, 2.2, 3.3, 4.4, 5.6 };
    char[] char_array = { 'c', 'h', 'a', 'r' };
    String[] string_array = { "Arijit", "Divya", "Vivek", "Sunidhi", "Haris" };
    boolean[] boolean_array = { true, false, true };

    System.out.println(Arrays.toString(int_array));
    System.out.println(Arrays.toString(double_array));
    System.out.println(Arrays.toString(char_array));
    System.out.println(Arrays.toString(string_array));
    System.out.println(Arrays.toString(boolean_array));
  }

  public static void main(String[] args) {
    arrayDatatypes();
  }
}