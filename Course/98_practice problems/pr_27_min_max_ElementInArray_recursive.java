
// public class pr_27_min_max_ElementInArray_recursive {

//     public static int minElementInArray_recursive(int [] arr , int l){
//         if(l < 0){
//             return -1;
//         }
//         if(l == 0){
//             return arr[l];
//         }

//         int result = Math.min(arr[l], minElementInArray_recursive(arr, l-1));
//         return result;
//     }

//     public static int maxElementInArray_recursive(int [] arr , int l){
//         if(l < 0){
//             return -1;
//         }
//         if(l == 0){
//             return arr[l];
//         }

//         int result = Math.max(arr[l], maxElementInArray_recursive(arr, l-1));
//         return result;
//     }
//     public static void main(String[] args) {
//         int [] arr = {34,55,232,543,5,33};
//         int l = arr.length -1;

//         System.out.println(minElementInArray_recursive(arr, l));
//         System.out.println(maxElementInArray_recursive(arr, l));
//     }
// }