

// public class pr_22_print_no_pattern{

//     public static void printPattern1(int n){
//         for (int i = 0; i <n; i++) {
//             for (int j = 0; j < i+1; j++) {
//                 System.out.print(j+1);
//             }
//             System.out.println("");
//         }
//     }

//     public static void printPattern2(int n){
//         for (int i = 0; i <n; i++) {
//             for (int j = 0; j < n-i; j++) {
//                 System.out.print(j+1);
//             }
//             System.out.println("");
//         }
//     }

//     public static void printPattern3(int n){
//         for (int i = 0; i <n; i++) {
//             for (int j = n; j > i; j--) {
//                 System.out.print(j);
//             }
//             System.out.println("");
//         }
//     }

//     public static void printPattern4(int n){
//         for (int i = n; i >0; i--) {
//             for (int j = n; j >i-1; j--) {
//                 System.out.print(j);
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String[] args) {
//         printPattern1(4);
//         printPattern2(4);
//         printPattern3(4);
//         printPattern4(4);
//     }
// }