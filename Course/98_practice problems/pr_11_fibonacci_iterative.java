// public class pr_11_fibonacci_iterative {

//     public static void printFib(int n){
//         int n0 = 0;
//         int n1 = 1;
//         System.out.print(0+" "+1+" ");

//         for (int i=2;i<=n;i++){
//             int num = n0+n1;
//             System.out.print(num+" ");
//             n0 = n1;
//             n1 = num;
//         }
//         System.out.println("");
//     }

//     public static int nthElementFib(int n){
//         int n0 = 0;
//         int n1 = 1;
//         int result=0;
//         for (int i=2;i<=n;i++){
//             int num = n0+n1;
//             n0 = n1;
//             n1 = num;
//             if (i==n){
//                 result = num;
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         //print fibonacci
//         printFib(10);

//         //nth element of fibonacci
//         System.out.println(nthElementFib(15));
//     }
// }
