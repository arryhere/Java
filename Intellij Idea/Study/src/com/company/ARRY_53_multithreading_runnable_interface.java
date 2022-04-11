//package com.company;
//
//class MyRunnableInterface1 implements Runnable{
//    public void run(){
//        for(int i=0;i<1000;i++) {
//            System.out.println("Hello Earth");
//        }
//    }
//}
//class MyRunnableInterface2 implements Runnable{
//    public void run(){
//        for(int i=0;i<1000;i++) {
//            System.out.println("Hello Mars");
//        }
//    }
//}
//
//public class ARRY_53_multithreading_runnable_interface {
//    public static void main(String[] args) {
//        MyRunnableInterface1 bullet1 = new MyRunnableInterface1();
//        MyRunnableInterface2 bullet2 = new MyRunnableInterface2();
//
//        Thread gun1 = new Thread(bullet1);
//        Thread gun2 = new Thread(bullet2);
//
//        gun1.start();
//        gun2.start();
//    }
//}
//
////-------------------------------------------------------------------------------------------------------------------------