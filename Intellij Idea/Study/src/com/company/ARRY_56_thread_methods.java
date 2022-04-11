//package com.company;
//
//class MyThread2 extends Thread{
//    public MyThread2(String name){
//        super(name);
//    }
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("I am a thread 1 - "+this.getName());
//        }
//    }
//}
//
//class MyThread3 extends Thread{
//
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("I am a thread 2 - ");
//        }
//    }
//}
//
//public class ARRY_56_thread_methods {
//    public static void main(String[] args) {
//        MyThread2 t1 = new MyThread2("Arry");
//        MyThread2 t2 = new MyThread2("Arty");
//
//        t1.start();
//        try {
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//
//        t2.start();
//    }
//}
//
////-------------------------------------------------------------------------------------------------------------------------