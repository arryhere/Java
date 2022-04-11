//1.Create an array of 5 floats and calculate their sum.


//package com.company;
//import java.util.Scanner;
//
//public class ARRY_25_practice_6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        float [] arr = new float[5];
//        float sum =0;
//
//        for (int i=0 ; i<arr.length ; i++) {
//            System.out.printf("Enter the [%d] element : ",i);
//            arr[i] = sc.nextFloat();
//        }
//
//        for (int i=0 ; i<arr.length ; i++) {
//            sum = sum+arr[i];
//        }
//
//        System.out.println(sum);
//    }
//}

//------------------------------------------------------------------------------------------------------------------------

//2. Write a program to find out whether a given integer is present in an array or not.

//
//package com.company;
//import java.util.Scanner;
//
//public class ARRY_25_practice_6 {
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7,8,9,11};
//        int n =9;
//        boolean result = false;
//
//        for (int i=0 ; i<arr.length ; i++) {
//            if(n==arr[i]) {
//                result = true;
//                break;
//            }
//        }
//
//        if (result == true) {
//            System.out.println("n is in array !");
//        }
//        else {
//            System.out.println("n is not in array !");
//        }
//
//    }
//}

//------------------------------------------------------------------------------------------------------------------------

//3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_25_practice_6 {
//    public static void main(String[] args) {
//        float [] phy = {44,55,66,77,88};
//        float sum = 0;
//
//        for (int i=0 ; i<phy.length ; i++) {
//            sum = sum+phy[i];
//        }
//        System.out.printf("The average of physics marks is : %.2f ",sum/phy.length);
//    }
//}

//------------------------------------------------------------------------------------------------------------------------


//4. Create a Java program to add two matrices of size 2x3
//
//package com.company;
//import java.util.Scanner;
//
//public class ARRY_25_practice_6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        //matrix 1
//        int [][] mat1 ={{1,2,3},
//                        {4,5,6}};
//
//        //matrix 2
//        int [][] mat2 = new int[2][3];
//        for (int i=0 ; i<2 ; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.printf("mat2 - Enter the [%d] [%d] element : ", i, j);
//                mat2[i][j] = sc.nextInt();
//            }
//        }
//
//        //matrix 3
//        int [][] mat3 = new int[2][3];
//        for (int i=0 ; i<2 ; i++) {
//            for (int j = 0; j < 3; j++) {
//                mat3[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        for (int i=0 ; i<2 ; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.printf("%d ",mat3[i][j]);
//            }
//            System.out.println("");
//        }
//
//    }
//}

//------------------------------------------------------------------------------------------------------------------------

//5. Write a Java program to reverse an array.

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_25_practice_6 {
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5};
//        int n = arr.length;
//
//        for (int i=0 ; i<n/2 ; i++) {
//            int temp;
//            temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n-1-i] = temp;
//        }
//        for(int i=0 ; i<arr.length ; i++) {
//            System.out.printf("%d ",arr[i]);
//        }
//    }
//}

//------------------------------------------------------------------------------------------------------------------------

//6. Write a Java program to find the maximum element in an array.

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_25_practice_6 {
//    public static void main(String[] args) {
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        int [] arr = {1,2,3,4,5,666,7,8};
//        int max = -2147483648;
//
//        for (int i=0 ; i<arr.length ; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//
//    }
//}

//------------------------------------------------------------------------------------------------------------------------

//7. Write a Java program to find the minimum element in an array.

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_25_practice_6 {
//    public static void main(String[] args) {
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        int [] arr = {1,2,3,4,5,666,7,8};
//        int min = 2147483647;
//
//        for (int i=0 ; i<arr.length ; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println(min);
//
//    }
//}

//------------------------------------------------------------------------------------------------------------------------

//8. Write a Java program to find whether an array is sorted or not.

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_25_practice_6 {
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5};
//        boolean ifSorted = true;
//
//        for (int i=0 ; i<arr.length-1 ; i++) {
//            if (arr[i] > arr[i+1]) {
//                ifSorted = false;
//                break;
//            }
//        }
//        if (ifSorted == false) {
//            System.out.println("Array is not sorted");
//        }
//        else if (ifSorted == true) {
//            System.out.println("Array is sorted");
//        }
//    }
//}

//------------------------------------------------------------------------------------------------------------------------














