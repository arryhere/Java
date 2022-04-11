// public class pr_23_sumOfIntegers_recersive {

//     public static int sumOfIntegers_recersive(int n){
//         if(n < 0){
//             return -1;
//         }
//         else if(n == 1 || n == 0){
//             return n;
//         }
//         int result = n + sumOfIntegers_recersive(n-1);
//         return result;
//     }
//     public static void main(String[] args) {
//         System.out.println(sumOfIntegers_recersive(-1));
//     }
// }