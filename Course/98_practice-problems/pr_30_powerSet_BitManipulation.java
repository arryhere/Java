// import java.util.*;

// public class pr_30_powerSet_BitManipulation {

//     public static void powerSet(int [] arr){
//         for(int i=0;i<Math.pow(2, arr.length);i++){
//             for(int j=0;j<arr.length;j++){
//                 if((i & (1<<j)) > 0){
//                     System.out.print(arr[j]);
//                 }
//             }
//             System.out.println("");
//         }
//     }

//     public static void powerSetString(String [] arr){
//         List<String> ls = new ArrayList<>();
//         String s = "";
//         for(int i=0;i<Math.pow(2, arr.length);i++){
//             for(int j=0;j<arr.length;j++){
//                 if((i & (1<<j)) > 0){
//                     s = s+arr[j];
//                 }
//             }
//             ls.add(s);
//             s = "";
//         }
//         System.out.println(ls);
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,2,3};
//         String [] crr = {"a","b","c"};
//         // powerSet(arr);
//         powerSetString(crr);
//     }
// }