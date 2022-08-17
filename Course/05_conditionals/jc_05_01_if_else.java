import java.util.Scanner;

public class jc_05_01_if_else {
  public static void ifElse1(Scanner sc) {

    System.out.print("Enter your age : ");
    int age = sc.nextInt();

    if (age < 18) {
      System.out.println("You cannot drink booze zoomer");
    } else if (age >= 18 && age <= 50) {
      System.out.println("You can drink booze");
    } else {
      System.out.println("You cannot drink booze boomer");
    }
  }

  public static void ifElse2(Scanner sc) {

    System.out.print("Enter character (a or b or c) : ");
    char _char = sc.next().charAt(0);

    if (_char == 'a') {
      System.out.printf("Character is : %c\n", _char);
    } else if (_char == 'b' || _char == 'c') {
      System.out.printf("Character is : %c\n", _char);
    } else {
      System.out.printf("Wrong character fool : %c\n", _char);
    }
  }

  public static void ifElse3(Scanner sc) {

    System.out.print("Enter string (Superman or Blackadam) : ");
    String str = sc.next();
    str = str.trim();
    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);

    if (str.equals("Superman")) {
      System.out.printf("String is : %s\n", str);
    } else if (str.equals("BlackAdam")) {
      System.out.printf("String is : %s\n", str);
    } else {
      System.out.printf("Wrong String fool : %s\n", str);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ifElse1(sc);
    ifElse2(sc);
    ifElse3(sc);

    sc.close();
  }
}
