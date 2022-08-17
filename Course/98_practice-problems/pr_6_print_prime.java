// // prine prime numbers within a given range.

// import java.util.Scanner;

// public class pr_6_print_prime {

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

//     public static void print_prime(int n){
//         for (int i=0;i<=n;i++){
//             if (check_prime(i) == true){
//                 System.out.print(i+" ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the higher range, lower range being '0' - ");
//         int n = sc.nextInt();
//         print_prime(n);

//         sc.close();
//     }
// }
