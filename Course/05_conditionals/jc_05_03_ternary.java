import java.util.Scanner;

public class jc_05_03_ternary {

  public static void ternary() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 0 or 1 : ");
    int num = sc.nextInt();
    num = num >= 1 ? 1 : 0;
    
    String str = num == 1 ? "true" : "false";
    System.out.println(num + str);

    sc.close();
  }

  public static void main(String[] args) {
    ternary();
  }
}
