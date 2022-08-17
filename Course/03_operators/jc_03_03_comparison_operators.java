/*
• Java Comparison Operators
• Comparison operators are used to compare two values:

• Operator	  Name	                      Example
  ==	        Equal to	                  x == y	
  !=	        Not equal	                  x != y	
  >	          Greater than	              x > y	
  <	          Less than	                  x < y	
  >=	        Greater than or equal to	  x >= y	
  <=	        Less than or equal to	      x <= y
• 
*/

public class jc_03_03_comparison_operators {
  public static void comparisonOperators() {
    int x = 5;
    int y = 7;
    int z = 5;

    System.out.println(x + "==" + y + " " + (x == y));
    System.out.println(x + "==" + z + " " + (x == z));

    System.out.println(x + "!=" + y + " " + (x != y));
    System.out.println(x + "!=" + y + " " + (x != y));

    System.out.println(x + ">" + y + " " + (x > y));
    System.out.println(x + "<" + y + " " + (x < y));

    System.out.println(x + ">=" + y + " " + (x >= y));
    System.out.println(x + "<=" + y + " " + (x <= y));
    System.out.println(x + ">=" + z + " " + (x >= z));
    System.out.println(x + "<=" + z + " " + (x <= z));
  }

  public static void main(String[] args) {
    comparisonOperators();
  }
}