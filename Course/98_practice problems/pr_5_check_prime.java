// // check prime number or not.

// import java.util.Scanner;

// public class pr_5_check_prime {

//     public static boolean check_prime(int n){
//         boolean b = false;
//         if ( n<=0 || n==1){
//             b = false;
//         }
//         else if(n == 2){
//             b =  true;
//         }
//         else {
//             for (int i=2;i<n;i++){
//                 if (n%i == 0){
//                     b = false;
//                     break;
//                 }
//                 else {
//                     b = true;
//                 }
//             }
//         }
//         return b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number to check - ");
//         int n = sc.nextInt();

//         if (check_prime(n) == true){
//             System.out.println(n+" is prime");
//         }
//         else {
//             System.out.println(n+" is not prime");
//         }

//         sc.close();
//     }

// }
