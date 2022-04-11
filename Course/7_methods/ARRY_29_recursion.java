//package com.company;
//import java.util.Scanner;
//
//public class ARRY_29_recursion {
//
//    static int factorial_recursive(int a) {
//        if(a==0 || a==1) {
//            return 1;
//        }
//        else {
//            return a * factorial_recursive(a-1);
//        }
//    }
//
//    static int factorial(int a) {
//        int result =1;
//        for(int i=1 ; i <= a ; i++) {
//            result = result*i;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number --> ");
//        int num = sc.nextInt();
//        System.out.printf("The factoral_recusrive of %d is : %d\n",num,factorial_recursive(num));
//        System.out.printf("The factoral of %d is : %d\n",num,factorial(num));
//    }
//}
