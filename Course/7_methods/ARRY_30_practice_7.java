//1.Write a Java method to print the multiplication table of a number n.
//
//package com.company;
//import java.util.Scanner;
//
//public class ARRY_30_practice_7 {
//
//    static void mul (int num , int range) {
//        for (int i=1 ; i<=range ; i++) {
//            int result = num*i;
//            System.out.printf("%d x %d = %d\n",num,i,result);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int num = sc.nextInt();
//        System.out.print("Enter the range : ");
//        int range = sc.nextInt();
//
//        mul(num,range);
//
//
//    }
//}

//-------------------------------------------------------------------------------------------------------------------------

//2. Write a program using functions to print the following pattern:
//        *
//        **
//        ***
//        ****

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_30_practice_7 {
//
//    static void pattern (int n) {
//        for(int i=0 ; i<n ; i++) {
//            for (int j=0 ; j<=i ; j++) {
//                System.out.printf("*");
//            }
//            System.out.print("\n");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Enter the number : ");
//        int n = sc.nextInt();
//
//        pattern(n);
//    }
//}

//-------------------------------------------------------------------------------------------------------------------------

//3.Write a recursive function to calculate the sum of first n natural numbers.
//
//package com.company;
//import java.util.Scanner;
//
//public class ARRY_30_practice_7 {
//
//    static int recursive_sum(int num) {
//        if (num==1) {
//            return 1;
//        }
//        else {
//            int result = num + recursive_sum(num - 1);
//            return result;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Enter the value : ");
//        int num = sc.nextInt();
//
//        int sum = recursive_sum(num);
//        System.out.println(sum);
//    }
//
//}

//-------------------------------------------------------------------------------------------------------------------------

//4. Write a function to print the following pattern:
//        ****
//        ***
//        **
//        *

//package com.company;
//import java.util.Scanner;
//public class ARRY_30_practice_7 {
//
//    static void pattern (int n) {
//        for(int i=0 ; i<n ; i++) {
//            for (int j=0 ; j<n-i ; j++) {
//                System.out.printf("*");
//            }
//            System.out.println("");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Enter the number : ");
//        int n = sc.nextInt();
//
//        pattern(n);
//    }
//}

//-------------------------------------------------------------------------------------------------------------------------

//5. Write a function to print the nth term of the Fibonacci series using recursion.
//   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,.....
//
//package com.company;
//import java.util.Scanner;
//
//public class ARRY_30_practice_7 {
//    static int fib(int n) {
//        if (n==1) {
//            return 0;
//        }
//        else if (n==2) {
//            return 1;
//        }
//        else {
//            return fib(n-1) + fib(n-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        int result = fib(4);
//        System.out.println(result);
//    }
//}

//-------------------------------------------------------------------------------------------------------------------------

//6. Write a function to find the average of a set of numbers passed as arguments.
//
//package com.company;
//import java.util.Scanner;
//
//public class ARRY_30_practice_7 {
//    static float average(float ...arr){
//        float sum =0;
//        for (int i=0 ; i<arr.length ; i++){
//            sum = sum + arr[i];
//        }
//        float avg = sum / arr.length;
//        return avg;
//    }
//
//
//    public static void main(String[] args) {
//        float result = average(1,2,3,4,6.6f);
//        System.out.println(result);
//    }
//}

//-------------------------------------------------------------------------------------------------------------------------

//7. Write a function to convert Celsius temperature into Fahrenheit.
//
//package com.company;
//import java.util.Scanner;
//
//public class ARRY_30_practice_7 {
//
//    static float tempConv (float c){
//        return (c*(9.0f/5.0f)) + 32.0f;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Enter the temp in celsius : ");
//        float c = sc.nextFloat();
//        System.out.println(tempConv(c));
//
//    }
//}

//-------------------------------------------------------------------------------------------------------------------------