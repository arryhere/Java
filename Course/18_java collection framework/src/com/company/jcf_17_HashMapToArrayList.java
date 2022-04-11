//package com.company;
//
//import javax.swing.text.html.parser.Entity;
//import java.util.*;
//
//public class jcf_17_HashMapToArrayList {
//    public static void func1(){
//        HashMap<Integer,String> map = new HashMap<>();
//        map.put(1,"Divya");
//        map.put(2,"Sohini");
//        map.put(3,"Nitika");
//        map.put(4,"Mohini");
//        map.put(5,"Sulagna");
//
//        ArrayList<Integer> l1 = new ArrayList<>(map.keySet());
//        ArrayList<String> l2 = new ArrayList<>(map.values());
//        System.out.println(l1);
//        System.out.println(l2);
//
//
//        ArrayList<Integer> l3 = new ArrayList<>();
//        ArrayList<String> l4 = new ArrayList<>();
//        Set<Map.Entry<Integer,String>> s =  map.entrySet();
//        for(Map.Entry<Integer,String> o:s){
//            //System.out.println(o.getKey() + " " + o.getValue());
//            l3.add(o.getKey());
//            l4.add(o.getValue());
//        }
//        System.out.println(l3);
//        System.out.println(l4);
//
//    }
//    public static void main(String[] args) {
//        func1();
//    }
//}
