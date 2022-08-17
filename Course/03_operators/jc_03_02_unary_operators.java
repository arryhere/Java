/*
Java Unary Operator
The Java unary operators require only one operand. Unary operators are used to perform various operations i.e.:

• incrementing/decrementing a value by one
• negating an expression
• inverting the value of a boolean

• ++i i++ --i i-- : increment decrement
• ~ : Bitwise Complement Operator (~ tilde) , bitwise complement of n will be -(n+1)
• ! : Logical NOT Operator(!)


*/

public class jc_03_02_unary_operators {
  public static void unaryOperators() {
    int x = 10;
    System.out.println(x++); // 10 (11)
    System.out.println(++x); // 12
    System.out.println(x--); // 12 (11)
    System.out.println(--x); // 10

    int a = 21;
    Boolean b = true;
    System.out.println(~a); // 22
    System.out.println(~(-a)); // 20
    System.out.println(!b); // false
  }

  public static void main(String[] args) {
    unaryOperators();
  }
}
