// // Reverse String

// import java.util.Scanner;

// public class pr_3_reverse_string {

//     public static String reverseString(String s){
//         char [] c = s.toCharArray();

//         for (int j=0;j<c.length/2;j++){
//             char temp;
//             temp =  c[j];
//             c[j] = c[c.length-1-j];
//             c[c.length-1-j] = temp;
//         }

//         String s1 = new String(c);

//         return s1;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the string - ");
//         String s = sc.nextLine();
        
//         String revStr = reverseString(s);
//         System.out.println(revStr);

//         sc.close();

//     }
// }