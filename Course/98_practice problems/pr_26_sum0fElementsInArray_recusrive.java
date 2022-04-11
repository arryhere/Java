// public class pr_26_sum0fElementsInArray_recusrive {

//     public static int sum0fElementsInArray_recusrive(int [] arr , int l){
//         if(l == 0){
//             return arr[0];
//         }
//         int result = arr[l] + sum0fElementsInArray_recusrive(arr , l-1);
//         return result;
//     }
//     public static void main(String[] args) {
//         int [] arr = {100,2,3,4,5};
//         int l = arr.length -1;
//         System.out.println(sum0fElementsInArray_recusrive(arr, l));
//     }   
// }