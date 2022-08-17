
// // check if number is fibonacci or not. 
// // A number is Fibonacci if and only if one or both of (5*n2 + 4) or (5*n2 – 4) is a perfect square

// import java.util.Scanner;


// public class pr_9_check_fibonacci {

//     public static boolean isPerfectSquare(int s){
//         int a = (int)Math.sqrt(s);
//         if(a*a == s){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }

//     public static boolean isFibonacci(int n){
//         boolean b1 = isPerfectSquare(5*n*n + 4);
//         boolean b2 = isPerfectSquare(5*n*n - 4);
        
//         if(b1 == true || b2 == true){
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         for(int i=0;i<10;i++){
//             System.out.print("Enter the number to check - ");
//             int n = sc.nextInt();

//             if(isFibonacci(n) == true){
//                 System.out.println(n+" is a fibonacci number");
//             }
//             else{
//                 System.out.println(n+" is not a fibonacci number");
//             }
//         }

//         sc.close();
//     }
    
// }
