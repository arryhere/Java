//1.Write a java program to demonstrate syntax, logical and runtime errors.

//package com.company;
//
//public class ARRY_65_practice_14 {
//    public static void main(String[] args) {
//        int a = 5 //syntax error
//        int b = 6;
//        int c = 7;
//        int d = b*c;
//        System.out.println(b); //// logical error
//        int result = 6/0; //runtime error
//    }
//}

////-------------------------------------------------------------------------------------------------------------------------

//2.Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
//
//package com.company;
//
//public class ARRY_65_practice_14 {
//    public static void main(String[] args) {
//        try {
//            int a = 666/0;
//        }
//        catch (ArithmeticException e){
//            System.out.println("Haha");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("Hehe");
//        }
//    }
//}

////-------------------------------------------------------------------------------------------------------------------------

//3.Write a program that allows you to keep accessing and array until a vlaid index is given.
//  If max retries exceed 5 print "errors"

//package com.company;
//import java.util.Scanner;
//
//class MyException extends Exception{
//    public String toString(){
//       return "my custom string";
//    }
//    public String getMessage(){
//        return "my custom message";
//    }
//}
//
//public class ARRY_65_practice_14 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int [] a = {22,33,45,67,22,};
//        int ind;
//        boolean flag = true;
//        int j=0;
//
//        while (flag && j<5) {
//            for(int i=0;i<a.length;i++){
//                System.out.printf("%d[%d] ",a[i],i);
//            }
//            try {
//                System.out.print("\nEnter the array index : ");
//                ind = sc.nextInt();
//                System.out.printf("The value of a[%d] is : %d",ind,a[ind]);
//                System.out.println("\n--------------------------------------------------------------------");
//                break;
//            }
//            catch (Exception e){
//                j++;
//                System.out.println("Error, Retry !";
//                System.out.println("--------------------------------------------------------------------");
//            }
//
//        }
//        System.out.println("End of Line");
//    }
//}

////-------------------------------------------------------------------------------------------------------------------------
//























