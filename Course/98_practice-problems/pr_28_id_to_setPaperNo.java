// //convert student id to paper set no //id=2 set=B

// public class pr_28_id_to_setPaperNo {

//     public static int sumOFDigits(int n){
//         int s = 0;
//         while(n!=0){
//             s = s + n%10;
//             n = n/10;
//         }
//         return s;
//     }
//     public static int sumIfGreaterThan26(int s){
//         if(s > 26) {
//             int s2 =0;
//             while(s != 0){
//                 s2 = s2 + s%10;
//                 s = s/10;
//             }
//             return s2;
//         }
//         else {
//             return s;
//         }
//     }
//     public static void main(String[] args) {
//         int n = 6442;
//         int result_1 = sumOFDigits(n);
//         int result_2 = sumIfGreaterThan26(result_1);
//         char result_3 = (char)(result_2+64);

//         System.out.println("Result 1 : "+result_1);
//         System.out.println("Result 2 : "+result_2);
//         System.out.println("Result 3 : "+result_3);

//     }
// }