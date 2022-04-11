//package com.company;
//
//import java.util.Scanner;
//
//class MyException extends Exception{
//    @Override
//    public String toString(){
//        return "i am toString";
//    }
//    @Override
//    public String getMessage(){
//        return "i am getMessage";
//    }
//}
//
//public class ARRY_62_exception_class {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the number : ");
//        int a = sc.nextInt();
//
//        if(a<9){
//            try {
//                throw new MyException();
//            }
//            catch (Exception e1){
//                System.out.println(e1.getMessage());
//                System.out.println(e1.toString());
//                System.out.println(e1);
//                e1.printStackTrace();
//            }
//        }
//    }
//}
//
////-------------------------------------------------------------------------------------------------------------------------