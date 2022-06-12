/*

Arithmetic Operators
Arithmetic operators are used to perform common mathematical operations.

Operator	    Name	        Description	                                Example
   +	        Addition	    Adds together two values	                x + y
   -	        Subtraction	    Subtracts one value from another	        x - y
   *	        Multiplication	Multiplies two values	                    x * y
   /	        Division	    Divides one value by another	            x / y
   %	        Modulus	        Returns the division remainder	            x % y
   ++	        Increment	    Increases the value of a variable by 1	    ++x	
   --	        Decrement	    Decreases the value of a variable by 1	    --x

*/

public class jc_02_01_arithmetic_operators {
    public static void arithmetic() {
        int a = 10;
        int b = 5;

        System.out.println(a + b);          // 15
        System.out.println(a - b);          // 5
        System.out.println(a * b);          // 50
        System.out.println(a / b);          // 2
        System.out.println(a % b);          // 0

        System.out.println(a++);            // 10
        System.out.println(++a);            // 12

        System.out.println(b--);            // 5
        System.out.println(--b);            // 3
    }

    public static void main(String[] args) {
        arithmetic();
    }
}
