//1. Write a Java program to convert a string to lowercase.

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_13_practice_3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the string : ");
//        String str = sc.nextLine();
//        String new_str = str.toLowerCase();
//        System.out.println(new_str);
//    }
//}

//----------------------------------------------------------------------------------------------------------------------

//2. Write a Java program to replace spaces with underscores.
//
//package com.company;
//import java.util.Scanner;
//
//public class ARRY_13_practice_3 {
//    public static void main(String[] args) {
//        String str = "Arijit Das of INDIA";
//        String new_str = str.replace(" ", "_");
//        System.out.println(new_str);
//    }
//}

//----------------------------------------------------------------------------------------------------------------------

//3. Write a Java program to fill in a letter template which looks like below:
// letter = “Dear <|name|>, Thanks a lot”
// Replace <|name|> with a string (some name)
//
//package com.company;
//import java.util.Scanner;
//
//public class ARRY_13_practice_3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String letter = "Dear <|name|>, Thanks a lot";
//
//        System.out.print("Enter your name : ");
//        String name = sc.nextLine();
//
//        String new_str = letter.replace("<|name|>" , name);
//        System.out.println(new_str);
//    }
//}

//----------------------------------------------------------------------------------------------------------------------

//4. Write a Java program to detect double and triple spaces in a string.


//package com.company;
//import java.util.Scanner;
//
//public class ARRY_13_practice_3 {
//    public static void main(String[] args) {
//        String str = "This  string   contains and tripple spaces";
//        int a1 = str.indexOf("  ");
//        int a2 = str.indexOf("   ");
//        System.out.printf("Result :\na1 = %d\na2 = %d",a1,a2);
//    }
//}

//----------------------------------------------------------------------------------------------------------------------

//5. Write a program to format the following letter using escape sequence characters.
//Letter = “Dear Harry, This Java Course is nice. Thanks”

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_13_practice_3 {
//    public static void main(String[] args) {
//        String Letter = "Dear Harry, This Java Course is nice. Thanks";
//        String Letter2 = "Dear Harry,\n\tThis Java Course is nice.\nThanks";
//
//        System.out.println(Letter);
//        System.out.println(Letter2);
//    }
//}

//------------------------------------------------------------------------------------------------------------------------