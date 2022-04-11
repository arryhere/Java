//package com.company;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//
//public class jcf_05_synchronized_and_threadSafety_ArrayList_3 {
//    public static void main(String[] args) {
//
//        //1. Collection.synchronizedList
//        List<String> l = Collections.synchronizedList(new ArrayList<String>());
//        l.add("Java");
//        l.add("Python");
//        l.add("C");
//
//        System.out.println(l);
//
//        synchronized (l){
//            Iterator<String> it = l.iterator();
//            while(it.hasNext()){
//                System.out.println(it.next());
//            }
//        }
//
//        //2.copyOnWriteArrayList  --  it is a class Thread-Safe/Synchronized
//        CopyOnWriteArrayList<String> l2 = new CopyOnWriteArrayList<>();
//        l2.add("Tom");
//        l2.add("Rahul");
//        l2.add("Divya");
//        l2.add("Sahil");
//
//        Iterator<String> it2 = l2.iterator();
//        while(it2.hasNext()){
//            System.out.println(it2.next());
//        }
//    }
//}
