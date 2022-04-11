//package com.company;
//
//class MyThread1 extends Thread{
//    public MyThread1(String name){
//        super(name);
//    }
//    public void run(){
//        for(int i=0;i<100;i++){
//            System.out.println("I am a thread - "+this.getName());
//        }
//    }
//}
//
//public class ARRY_55_thread_priorities {
//    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1("ARRY1");
//        MyThread1 t2 = new MyThread1("ARRY2");
//        MyThread1 t3 = new MyThread1("ARRY3");
//        MyThread1 t4 = new MyThread1("ARRY4");
//        MyThread1 t5 = new MyThread1("ARRY5 - most imp");
//
//        t5.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t1.setPriority(Thread.MIN_PRIORITY);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//    }
//}
//
////-------------------------------------------------------------------------------------------------------------------------