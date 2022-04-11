//////Exercise 6: You have to create a custom calculator with following operations:
//////       1. + -> Addition
//////       2. - -> Subtraction
//////       3. * -> Multiplication
//////       4. / -> Division
//////       which throws the following exceptions:
//////       1. Invalid input Exception ex: 8 & 9
//////       2. Cannot divide by 0 Exception
//////       3. Max Input Exception if any of the inputs is greater than 100000
//////       4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
//////
//
//
//package com.company;
//
//class MaxInputException extends Exception{
//    public String toString(){
//        return "Max input reached : 100000";
//    }
//}
//class InvalidInputException extends Exception{
//    public String toString(){
//        return "Cannot have input 8 or 9";
//    }
//}
//class MaxMulInputException extends Exception{
//    public String toString(){
//        return "Max mul input reached : 7000";
//    }
//}
//class CannotDivideByZeroException extends Exception{
//    public String toString(){
//        return "Cannot divide by 0";
//    }
//}
//
//class Calculator{
//    public double add(double a,double b) throws MaxInputException,InvalidInputException{
//        if(a>100000 || b>100000){
//            throw new MaxInputException();
//        }
//        if(a==8 || b==9){
//            throw new InvalidInputException();
//        }
//        return a+b;
//    }
//    public double sub(double a,double b) throws MaxInputException,InvalidInputException{
//        if(a>100000 || b>100000){
//            throw new MaxInputException();
//        }
//        if(a==8 || b==9){
//            throw new InvalidInputException();
//        }
//        return a-b;
//    }
//    public double mul(double a,double b) throws MaxInputException,MaxMulInputException{
//        if(a>100000 || b>100000){
//            throw new MaxInputException();
//        }
//        if(a>7000 || b>7000){
//            throw new MaxMulInputException();
//        }
//        return a*b;
//    }
//    public double div(double a,double b) throws MaxInputException,CannotDivideByZeroException{
//        if(a>100000 || b>100000){
//            throw new MaxInputException();
//        }
//        if(b==0){
//            throw new CannotDivideByZeroException();
//        }
//        return a/b;
//    }
//}
//
//public class ARRY_76_exercise_6 {
//    public static void main(String[] args) throws MaxInputException,InvalidInputException,MaxMulInputException,CannotDivideByZeroException{
//        Calculator c = new Calculator();
//
//        try {
//            c.add(1000002,9);
//        }
//        catch (Exception e){
//            System.out.println("Error : "+e);
//        }
//
//        try {
//            c.sub(10,9);
//        }
//        catch (Exception e){
//            System.out.println("Error : "+e);
//        }
//
//        try {
//            c.mul(7001,9);
//        }
//        catch (Exception e){
//            System.out.println("Error : "+e);
//        }
//
//        try {
//            c.div(8,0);
//        }
//        catch (Exception e) {
//            System.out.println("Error : " + e);
//        }
//
//    }
//}
//
//////-------------------------------------------------------------------------------------------------------------------------
//