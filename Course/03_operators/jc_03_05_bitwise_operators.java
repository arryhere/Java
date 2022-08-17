/*
• Java Bitwise Operators
• It allows access and modification of a particular bit inside a section of the data

• Operator	Description	              Example	        Same as	        Result	    Decimal
    &	        AND	                    5 & 1	          0101 & 0001	    0001	      1
    |	        OR	                    5 | 1	          0101 | 0001	    0101	      5
    ~	        NOT	                    ~ 5	            ~0101	          1010	      10 (*)
    ^	        XOR	                    5 ^ 1	          0101 ^ 0001	    0100	      4
    <<	      left shift	            5 << 1	        0101 << 1	      1010	      10
    >>	      right shift	            5 >> 1	        0101 >> 1	      0010	      2
    >>>	      unsigned right shift	  5 >>> 1	        0101 >>> 1	    0010	      2 
• 
*/

public class jc_03_05_bitwise_operators {
  public static void bitwiseOperators() {
    int x = 5;                                                            // 00000000000000000000000000000101
    int y = 12;                                                           // 00000000000000000000000000001100

    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(y));

    int bitwise_AND = x & y;                                              // 00000000000000000000000000000100, 4
    int bitwise_OR = x | y;                                               // 00000000000000000000000000001101, 13
    int bitwise_NOT = ~x;                                                 // 11111111111111111111111111111010, -6
    int bitwise_XOR = x ^ y;                                              // 00000000000000000000000000001001, 9
    
    System.out.println("bitwise_AND " + bitwise_AND);
    System.out.println("bitwise_OR " + bitwise_OR);
    System.out.println("bitwise_NOT " + bitwise_NOT);
    System.out.println("bitwise_XOR " + bitwise_XOR);
    
    int left_shift = x << 2;                                              // 00000000000000000000000000010100 , 20
    int right_shift = y >> 2;                                             // 00000000000000000000000000000011 , 3
    System.out.println("left_shift " + left_shift);
    System.out.println("right_shift " + right_shift);

    System.out.println(Integer.toBinaryString(-5));                       // 11111111111111111111111111111011 , -5
    int unsigned_right_shift = -5 >>> 2;                                  // 00111111111111111111111111111110 , 1073741822
    int signed_right_shift = -5 >> 2;                                     // 11111111111111111111111111111110 , -2
    System.out.println("unsigned_right_shift " + unsigned_right_shift);
    System.out.println("signed_right_shift " + signed_right_shift);

    System.out.println(0b00111111111111111111111111111110);             // 1073741822
    System.out.println(0b11111111111111111111111111111110);             // -2

    System.out.println(Integer.toString(-5, 2));                    // -101
    System.out.println(Integer.toBinaryString(-5));                       // 11111111111111111111111111111011
  }

  public static void main(String[] args) {
    bitwiseOperators();
  }
}