// //Fibonacci Series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
// // nth element , print elements of given range , operation in fibonacci


// public class pr_10_fibonacci_recursive {

//     public static int nthElementOfFibonacci(int n){
//         if (n==1 || n==0){
//             return n;
//         }
//         int num = nthElementOfFibonacci(n-1) + nthElementOfFibonacci(n-2);
//         return num;
//     }

//     public static void printFibonacci(int n1, int n2){

//         System.out.printf("Fibonacci series [%d,%d] - ",n1,n2);
//         for(int i=n1;i<=n2;i++){
//             System.out.print(nthElementOfFibonacci(i)+" ");
//         }
//         System.out.println("");
//     }

//     public static int sumFibonacci(int n1, int n2){

//         System.out.printf("Sum of Fibonacci series [%d,%d] - ",n1,n2);
//         int sum=0;
//         for(int i=n1;i<=n2;i++){
//             sum = sum+nthElementOfFibonacci(i);
//         }
//         return sum;
//     }

//     public static void main(String[] args) {

//         //nth element of fibonacci
//         int n1 = 10;
//         System.out.println(n1+"th element of fibonacci series - "+nthElementOfFibonacci(n1));

//         //print fibonacci of given range
//         printFibonacci(2,10);

//         // sum of fibonacci numbers of given range
//         System.out.println(sumFibonacci(0, 10));

//     }
// }
