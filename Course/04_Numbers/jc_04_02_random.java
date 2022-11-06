/*
• random no generator
• 
*/

import java.util.Random;

public class jc_04_02_random {
  public static void random() {
    Random rand = new Random();

    int a = rand.nextInt(5); // 0(inclusive) - 5(exclusive)
    int x = rand.nextInt(5) + 1; // 1(inclusive) - 6(exclusive)
    double y = rand.nextDouble(5 - 4) + 4; // 4(inclusive) - 5(exclusive)
    boolean z = rand.nextBoolean(); // true or false

    System.out.println(a);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
  }

  public static void main(String[] args) {
    random();

  }
}