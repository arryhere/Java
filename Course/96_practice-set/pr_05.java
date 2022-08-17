// Write a program to convert kilometers to miles.

import java.util.Scanner;

public class pr_05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value in kilometers : ");
    float kilo = sc.nextFloat();
    float miles = kilo / 1.609344f;

    System.out.println("The value in miles is : " + miles);

    sc.close();
  }
}
