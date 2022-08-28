/*
• Java String
• In Java, string is basically an object that represents sequence of char values
• An array of characters works same as Java string , char[] ch = {'j','a','v','a'};  
• String s1 = "Welcome";  
  String s2 = "Welcome";  //It doesn't create a new instance
  String objects are stored in a special memory area known as the "string constant pool"
  s2 is referennced from the "string constant pool"
• 
• 
*/

import java.util.Scanner;

public class jc_08_01_strings {
  public static void strings() {
    Scanner sc = new Scanner(System.in);

    String greet1 = new String("Hello ");
    String greet2 = " welcome to our coding bootcamp !";

    System.out.print("Please enter your name: ");
    String name = sc.nextLine();

    System.out.print( greet1 + name.trim() + greet2);

    sc.close();
  }

  public static void main(String[] args) {
    strings();
  }
}
