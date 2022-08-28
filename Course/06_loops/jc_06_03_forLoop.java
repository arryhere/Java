
public class jc_06_03_forLoop {

  public static void forLoop() {
    for (int i = 0; i < 10; i++) {
      System.out.print(i == 0 ? i : " " + i);
    }
    System.out.println();

    for (int i = 10; i > 0; i--) {
      System.out.print(i == 10 ? i : " " + i);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    forLoop();
  }
}