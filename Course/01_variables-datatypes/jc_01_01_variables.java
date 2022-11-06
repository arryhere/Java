/*
• The general rules for naming variables are:
• Names can contain letters, digits, underscores, and dollar signs
• Names must begin with a letter
• Names should start with a lowercase letter and it cannot contain whitespace
• Names can also begin with $ and _ (but we will not use it in this tutorial)
• Names are case sensitive ("myVar" and "myvar" are different variables)
• Reserved words (like Java keywords, such as int or boolean) cannot be used as names

• Local Variable : A variable declared inside the body of the method
• Instance Variable : A variable declared inside the class but outside the body of the method
• Static variable : Class reference is used to call the variable, single copy of the static variable is created
*/

public class jc_01_01_variables {
  int a = 44; // instance variable
  static int b = 33; // static variable

  public static void sum() {
    int num1, num2, num3, sum; // local variable
    num1 = 4;
    num2 = 5;
    num3 = 6;
    sum = num1 + num2 + num3;
    System.out.print("The sum of these numbers is : ");
    System.out.println(sum);
  }

  public static void main(String[] args) {
    sum();
    System.out.println(new jc_01_01_variables().a);
    System.out.println(b);
  }
}
