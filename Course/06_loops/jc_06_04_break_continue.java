
public class jc_06_04_break_continue {

  public static void break_continue() {
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        System.out.print("break");
        break;
      } else {
        System.out.print(i + " ");
      }
    }
    System.out.println();

    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        System.out.print("continue ");
        continue;
      } else {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    break_continue();
  }
}