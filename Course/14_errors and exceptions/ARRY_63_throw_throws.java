//package com.company;
//
//class NegativeRadiusException extends Exception{
//    public String toString(){
//        return "Radius cannot be negative";
//    }
//    public String getMessage(){
//        return "Radius cannot be negative";
//    }
//}
//
//public class ARRY_63_throw_throws {
//
//    public static double area(int r) throws NegativeRadiusException{
//        if(r<0){
//            throw new NegativeRadiusException();
//        }
//        return Math.PI*Math.sqrt(r);
//    }
//
//    public static int divide(int a , int b) throws ArithmeticException{
//        return a/b;
//    }
//
//    public static void main(String[] args){
//
//        // ArithmeticException handled by java compiler
//        try {
//            int c = divide(6 , 0);
//            System.out.println(c);
//            double ar = area(-6);
//        }
//        catch (Exception e){
//            System.out.println("Exception : "+e);
//        }
//
//        // user defined exception
//        try {
//            double ar = area(-6);
//        }
//        catch (Exception e){
//            System.out.println("Exception : "+e);
//        }
//
//    }
//}
//
////-------------------------------------------------------------------------------------------------------------------------
