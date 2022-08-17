/*
• Java Logical Operators
• Logical operators are used to determine the logic between variables or values:

• Operator	  Name	        Description	                                              Example
  && 	        Logical and	  Returns true if both statements are true	                x < 5 &&  x < 10	
  || 	        Logical or	  Returns true if one of the statements is true	            x < 5 || x < 4	
  !	          Logical not	  Reverse the result, returns false if the result is true	  !(x < 5 && x < 10)
• 
*/

public class jc_03_04_logical_operators {
  public static void logicalOperators() {
    int x = 5;
    int y = 7;
    int z = 5;

    Boolean bool_1 = x < y && x > z; // false

    Boolean bool_2 = x < y || x > z; // true

    Boolean bool_3 = !(x < y); // false

    System.out.println(bool_1 + " " + bool_2 + " " + bool_3);
  }

  public static void main(String[] args) {
    logicalOperators();
  }
}