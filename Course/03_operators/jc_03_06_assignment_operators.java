/*
• Java Assignment Operators
• Assignment operators assign values to variables.
• Operator	Example	  Same As
     =	    x = 3	    x = 3	
     +=	    x += 3	  x = x + 3	
     -=	    x -= 3	  x = x - 3	
     *=	    x *= 3	  x = x * 3	
     /=	    x /= 3	  x = x / 3	
     %=	    x %= 3	  x = x % 3	
     &=	    x &= 3	  x = x & 3	
     |=	    x |= 3	  x = x | 3	
     ^=	    x ^= 3	  x = x ^ 3	
     >>=	  x >>= 3	  x = x >> 3	
     <<=	  x <<= 3	  x = x << 3
     >>>=   x >>>= 3  x = x >>> 3
• 
*/

public class jc_03_06_assignment_operators {

  public static void assignment() {
    int x = 5;

    x += 2; // 7
    x -= 2; // 5
    x *= 2; // 10
    x /= 5; // 2
    x %= 3; // 2

    x &= 5; // 010 AND 101 = 000 (0)
    x |= 7; // 000 OR 111 = 111 (7)
    x ^= 2; // 111 XOR 010 = 101 (5)
    x >>= 1; // 101 >> 1 = 010 (2)
    x <<= 1; // 010 << 1 = 100 (4)
    x >>>= 2; // 100 >>> 2 = 001 (1)

    System.out.println(x);
  }

  public static void main(String[] args) {
    assignment();
  }
}
