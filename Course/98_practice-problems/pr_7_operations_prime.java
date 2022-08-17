// //add mul sub div prime numbers within a given range.

// import java.util.Scanner;

// public class pr_7_operations_prime {

//     public static boolean check_prime(int n){
//         boolean b = false;
//         if (n<=0 || n==1){
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

//     public static int add_prime(int n){
//         int sum = 0;
//         for (int i=0;i<=n;i++){
//             if (check_prime(i) == true){
//                 sum = sum+i;
//             }
//         }
//         return sum;
//     }

//     public static int sub_prime(int n){
//         int sum = 0;
//         for (int i=0;i<=n;i++){
//             if (check_prime(i) == true){
//                 sum = sum-i;
//             }
//         }
//         return sum;
//     }

//     public static int mul_prime(int n){
//         int sum = 1;
//         for (int i=0;i<=n;i++){
//             if (check_prime(i) == true){
//                 sum = sum*i;
//             }
//         }
//         return sum;
//     }

//     public static double div_prime(int n){
//         double sum = 1;
//         for (int i=0;i<=n;i++){
//             if (check_prime(i) == true){
//                 sum = sum/i;
//             }
//         }
//         return sum;
//     }


//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the higher range, lower range being '0' - ");
//         int n = sc.nextInt();

//         System.out.println(add_prime(n));
//         // System.out.println(sub_prime(n));
//         // System.out.println(mul_prime(n));
//         // System.out.println(div_prime(n));

//         sc.close();

//     }
// }
