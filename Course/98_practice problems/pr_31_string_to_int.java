// import java.util.Arrays;

// public class pr_31_string_to_int {

//     public static void stringToInt(String s){
//         int length = s.length();

//         Integer n = Integer.valueOf(s);
//         System.out.println(n);

//         int [] arr = new int[length];
//         for(int i=0;i<length;i++){
//             arr[i] = n%10;
//             n = n/10;
//         }

//         for(int i=0;i<arr.length/2;i++){
//             int temp = arr[i];
//             arr[i] = arr[arr.length-1-i];
//             arr[arr.length-1-i] = temp;
//         }

//         System.out.println(Arrays.toString(arr));
        
//     }

//     public static void intToString(int n){
//         int a = n;
//         String s = String.valueOf(a);
//         int length = s.length();

//         int [] arr = new int[length];
//         for(int i=0;i<length;i++){
//             arr[i] = n%10;
//             n = n/10;
//         }
//         for(int i=0;i<arr.length/2;i++){
//             int temp = arr[i];
//             arr[i] = arr[arr.length-1-i];
//             arr[arr.length-1-i] = temp;
//         }

//         String [] srr = new String [length];
//         for(int i=0;i<length;i++){
//             srr[i] = String.valueOf(arr[i]);
//         }

//         System.out.println(s);
//         System.out.println(Arrays.toString(srr));
//     }
//     public static void main(String[] args) {
//         stringToInt("45631");
//         intToString(45333);
//     }
    
// }
