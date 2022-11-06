
public class jc_01_03_typecasting {

  public static void widening() { 
    // Widening casting is done automatically when passing a smaller size type to a larger size type
    int a = 10;
    float b = a;
    System.out.println(a);
    System.out.println(b + "\n");
  }

  public static void narrowing() { 
    // Narrowing casting must be done manually by placing the type in parentheses in front of the value
    float a = 10.54F;
    int b = (int) a;
    System.out.println(a);
    System.out.println(b + "\n");
  }

  public static void overflow() {
    int a = 130;
    byte b = (byte) a;
    System.out.println(a);
    System.out.println(b + "\n");
  }

  public static void Adding_Lower_Type() {
    byte a = 10;
    byte b = 11;
    // byte c = a + b; //as total sum of byte variables can exceed the range of byte
    byte c = (byte) (a + b);
    System.out.println(c + "\n"); // will give garbage value if range of byte is exceeded
  }

  public static void charInt() {
    char c = 'A';
    int i = 65;
    char c2 = 65;
    System.out.println((char) i);
    System.out.println((int) c);
    System.out.println(c2 + "\n");
  }

  public static void main(String[] args) {
    widening();
    narrowing();
    overflow();
    Adding_Lower_Type();
    charInt();

  }
}
