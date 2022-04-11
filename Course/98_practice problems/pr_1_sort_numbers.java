// //Sort numbers in ascending and descending order

// import java.util.Scanner;

// public class pr_1_sort_numbers {

//     public static int [] ascending_sort(int [] a){
//         for (int i=0;i<a.length;i++){
//             for (int j=i+1;j<a.length;j++){
//                 if (a[i] > a[j]){
//                     int temp;
//                     temp = a[i];
//                     a[i] = a[j];
//                     a[j] = temp;
//                 }
//             }
//         }
//         return a;
//     }

//     public static int [] descending_sort(int [] a){
//         for (int i=0;i<a.length;i++){
//             for (int j=i+1;j<a.length;j++){
//                 if (a[i] < a[j]){
//                     int temp;
//                     temp = a[i];
//                     a[i] = a[j];
//                     a[j] = temp;
//                 }
//             }
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the n.o of numbers you want to enter - ");
//         int n = sc.nextInt();

//         int [] arr = new int[n];

//         for (int i=0;i<arr.length;i++){
//             System.out.printf("Enter the [%d] element - ",i);
//             arr[i] = sc.nextInt();
//         }

//         for (int i=0;i<arr.length;i++){
//             System.out.printf("%d ",arr[i]);
//         }

//         System.out.println("\nAscending Sort - ");
//         int [] as = ascending_sort(arr);
//         for (int i=0;i<arr.length;i++){
//             System.out.printf("%d ",as[i]);
//         }

//         System.out.println("\nDescending Sort - ");
//         int [] ds = descending_sort(arr);
//         for (int i=0;i<arr.length;i++){
//             System.out.printf("%d ",ds[i]);
//         }

//         sc.close();
//     }

// }


