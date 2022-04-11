// public class pr_12_fibonacci_array {

//     public static int[] fibArray(int a){
//         int [] arr = new int[a+1];
//         arr[0] = 0;
//         arr[1] = 1;

//         for(int i=2;i<arr.length;i++){
//             arr[i] = arr[i-1] + arr[i-2];
//         }
//         return arr;
//     }

//     public static int nthElementFibArray(int a){
//         return fibArray(a)[a];

//     }
//     public static void main(String[] args) {

//         //print fibonacci
//         int [] arr = fibArray(11);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println("");

//         //nth element of fibonacci
//         System.out.println(nthElementFibArray(11));
//     }
    
// }
