
public class jc_08_02_string_methods {
  public static void charAt() {
    /*
     * charAt()
     * The Java String class charAt() method returns a char value at the given index
     * number
     */

    String name = "Arijit Das";
    for (int i = 0; i < name.length(); i++) {
      System.out.println("char at [" + i + "] " + name.charAt(i));
    }

    /*
     * char at [0] A
     * char at [1] r
     * char at [2] i
     * char at [3] j
     * char at [4] i
     * char at [5] t
     * char at [6]
     * char at [7] D
     * char at [8] a
     * char at [9] s
     */

  }

  public static void compareTo() {
    /*
     * The Java String class compareTo() method compares the given string with the
     * current string lexicographically
     * It returns a positive number, negative number, or 0
     * It compares strings on the basis of the Unicode value of each character in
     * the strings
     * if str1 > str2 return +ve number
     * if str1 < str2 return -ve number
     * if str1 = str2 return 0
     */

    System.out.println("Arijit".compareTo("Arijit")); // 0
    System.out.println("Arijit".compareTo("arijit")); // -32, 'A' is 32 times lower than 'a'
    System.out.println("Arijit".compareTo("Divya")); // -3, 'A' is 3 times lower than 'D'
    System.out.println("Rahul".compareTo("Divya")); // 14, 'R' is 14 times higher than 'D'
    System.out.println("Arijit".compareTo("")); // 6, returns length of the first string
    System.out.println("".compareTo("Arijit")); // -6, returns -ve length of the second string
  }

  public static void concat() {
    /*
     * The Java String class concat() method combines specified string at the end of
     * this string
     * It returns a combined string
     * It is like appending another string
     */

    String str = "Java";
    str = str.concat(" is the best programming language !").concat(" Who is C# ?");
    System.out.println(str);
  }

  public static void main(String[] args) {
    // charAt();
    // compareTo();
    // concat();
  }

}
