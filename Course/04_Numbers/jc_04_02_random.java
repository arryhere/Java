/*
• random no generator
• 
*/

import java.util.Random;

public class jc_04_02_random {
  public static void random() {
    Random rand = new Random();

    int x = rand.nextInt(5) + 1;  // 1 - 6
    double y = rand.nextDouble(5-4) + 4;  // 4 - 5
    boolean z = rand.nextBoolean(); // true or false

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
  }

  public static void main(String[] args) {
    random();
  }
}