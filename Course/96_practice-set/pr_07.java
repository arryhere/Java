// Program to calculate the hypotenuse of a triangle

import java.util.Scanner;

public class pr_07 {
  public static void hypotenuse() {
    Scanner sc = new Scanner(System.in);
    double x;
    double y;
    double z;

    System.out.print("Enter side x : ");
    x = sc.nextDouble();
    System.out.print("Enter side y : ");
    y = sc.nextDouble();
    
    z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    System.out.println("Hypotenuse : " + z);

    sc.close();
  }

  public static void main(String[] args) {
    hypotenuse();
  }
}