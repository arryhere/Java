////1. Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
////    Add a step method in the welcome thread to delay its execution for 200ms.
////    Demonstrate gerPriority() and setPriority() methods in Java threads.
////     How do you get the reference to the current thread in Java?
//
//package com.company;
//
//class Thread1 extends Thread{
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("Good Morning");
//        }
//    }
//}
//
//class Thread2 extends Thread {
//    public void run() {
//        for (int i=0; i<10; i++) {
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
//    }
//}
//
//public class ARRY_57_practice_13 {
//    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//
//        t1.setPriority(6);
//        t2.setPriority(9);
//
//        System.out.println(t1.getState());
//        System.out.println(t1.currentThread().getState());
//
//        t1.start();
//        t2.start();
//
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//
//    }
//
//}
//
////-------------------------------------------------------------------------------------------------------------------------
