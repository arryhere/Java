
import java.util.Scanner;

public class jc_06_01_while {

  public static void whileLoop() {
    int i = 0;
    while (i < 10) {
      System.out.print(i + " ");
      i++;
    }
    System.out.println();
  }

  public static void checkName(Scanner sc) {
    String name = "";
    while (name.isBlank()) {
      System.out.print("Enter your name: ");
      name = sc.nextLine();
    }
    System.out.println("Your name is: " + name);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    whileLoop();
    checkName(sc);

    sc.close();
  }
}