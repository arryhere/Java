
// import java.util.Arrays;
// import java.util.Scanner;

// public class java_regex_3_stringMethods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         //s.matches("regex")
//         String str = "Arijit Das 1999\\05\\28";
//         System.out.println(str);

//         boolean b = str.matches("^[A-Z][a-z]+[ ][A-Z][a-zA-Z]+[ ][\\d]{4}[\\\\]{1}[\\d]{2}[\\\\]{1}[\\d]{2}$");

//         System.out.println(b);

//         System.out.println("-----------------------------------------");

//         //s.split("regex")
//         String str1 = "aa bb cc dd eef";
//         System.out.println(str1);
//         String [] new_str1 = str1.trim().split("\\s+");

//         System.out.println(Arrays.toString(new_str1));

//         System.out.println("-----------------------------------------");

//         //s.replaceFirst("regex"), "replacement"
//         String str2 = "Arijit Das 1999\\05\\28";

//         String new_str2 = str2.replaceFirst("\\s+" , "-");
//         System.out.println(str2);
//         System.out.println(new_str2);

//         System.out.println("-----------------------------------------");

//         //s.replaceAll("regex"), "replacement"
//         String str3 = "Arijit Das 1999\\05\\28";

//         String new_str3 = str2.replaceAll("\\s+" , "-");
//         System.out.println(str3);
//         System.out.println(new_str3);

//         sc.close();
//     }
// }
