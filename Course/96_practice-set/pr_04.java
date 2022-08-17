// Write a java program which gets the user to enter his name and greets them with - "Hello <name>, have a good day !"

import java.util.Scanner;

public class pr_04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of the user : ");
    String name = sc.nextLine();

    System.out.println("Hello " + name + ", have a good day !");

    sc.close();
  }
}
