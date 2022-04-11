//package com.company;
//import java.util.Scanner;
//
//public class ARRY_60_handling_exceptions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr = new int[3];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Enter the [%d] element : ", i);
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Array : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("[%d]%d ", i, arr[i]);
//        }
//
//        System.out.println("");
//
//        System.out.print("Enter the array index : ");
//        int ind = sc.nextInt();
//
//        System.out.print("Enter the number u want to divide with : ");
//        int num = sc.nextInt();
//
//        try {
//            System.out.println("The value of array index entered is : "+ arr[ind]);
//            System.out.println("(array-index/number) is : "+ (arr[ind])/num);  //((float)arr[ind])/(float)num)
//        }
//        catch (ArithmeticException e){
//            System.out.print("Error1 : ");
//            System.out.println(e);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.print("Error2 : ");
//            System.out.println(e);
//        }
//        catch (Exception e){
//            System.out.print("Error3 : ");
//            System.out.println(e);
//        }
//    }
//}

////-------------------------------------------------------------------------------------------------------------------------