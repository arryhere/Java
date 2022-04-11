//package com.company;
//
//import java.util.Scanner;
//
//public class ARRY_61_nested_try_catch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int [] arr1 = {99,55,66};
//
//        boolean flag = true;
//
//        while (flag){
//            System.out.print("Enter the array index : ");
//            int ind = sc.nextInt();
//            try {
//                System.out.println("yello");
//                try {
//                    System.out.println(arr1[ind]);
//                    flag = false;
//                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println("Error1 : " + e);
//                }
//            } catch (Exception e) {
//                System.out.println("Error2 : " + e);
//            }
//            System.out.println("-------------------------------------------------------------------------------");
//        }
//        System.out.println("Have a great day !");
//    }
//}
//
//
////-------------------------------------------------------------------------------------------------------------------------