import java.util.Scanner;

public class jc_02_01_scanner {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    System.out.print("Enter your name : ");
    String name = sc.nextLine();                    // can take spaces

    System.out.print("Enter your age : ");
    int age = sc.nextInt();
    sc.nextLine();                                  // to flush the \n added due to enter

    System.out.print("Enter your gender : ");
    String gender = sc.next();                      // cannot take spaces

    System.out.printf("\nMy name is %s.\nI am %d years old.\nI identify as %s.\n", name, age, gender);

    sc.close();
  }
}
