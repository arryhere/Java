//package com.company;
//
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.Vector;
//
//public class jcf_22_Vector {
//    public static void vec(){
//        Vector<Integer> v = new Vector<>();
//        v.add(1);
//        v.add(2);
//        v.add(3);
//        v.add(4);
//        v.add(5);
//        System.out.println(v);
//        System.out.println(v.get(2));
//        System.out.println(v.remove(3));
//        System.out.println(v.capacity());
//        System.out.println(v.size());
//
//        Vector<Integer> v1 = new Vector<>();
//        v1.add(10);
//        v1.add(20);
//
//        v1.addAll(2,v);
//        System.out.println(v1);
//        System.out.println(v.isEmpty());
//
//        for(Integer o:v){
//            System.out.println(o);
//        }
//        Iterator<Integer> it = v.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        Collections.sort(v1,Collections.reverseOrder());
//        System.out.println(v1);
//    }
//    public static void main(String[] args) {
//        vec();
//    }
//}
