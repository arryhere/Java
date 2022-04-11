//package com.company;
//
//import java.util.*;
//
//public class jcf_19_TreeMap {
//    public static void func1(){
//        TreeMap<Integer,String> tmap = new TreeMap<>();
//        tmap.put(3,"Sohini");
//        tmap.put(2,"Aradhya");
//        tmap.put(1,"Divya");
//        tmap.put(4,"Sanjukta");
//        tmap.put(0,"Mrinal");
//
//        System.out.println(tmap);
//
//        Set<Map.Entry<Integer, String>> s = tmap.entrySet();
//        for(Map.Entry<Integer, String> o:s){
//            System.out.println(o.getKey() + " " + o.getValue());
//        }System.out.println("-------------------------");
//
//        Iterator<Map.Entry<Integer, String>> it =  tmap.entrySet().iterator();
//        while(it.hasNext()){
//            Map.Entry<Integer, String> me = it.next();
//            System.out.println(me.getKey() + " " + me.getValue());
//        }System.out.println("-------------------------");
//
//        System.out.println(tmap.lastKey());
//        System.out.println("-------------------------");
//
//        System.out.println(tmap.keySet());
//        SortedMap<Integer,String> tmap2 = tmap.headMap(4);
//        Set<Integer> s2 = tmap2.keySet();
//        System.out.println(s2);
//        System.out.println("-------------------------");
//
//        Set<Integer> s3 = tmap.tailMap(3).keySet();
//        System.out.println(s3);
//        System.out.println("-------------------------");
//
//        TreeMap<Integer,String> tmap3 = (TreeMap<Integer,String>)tmap.clone();
//        System.out.println(tmap3);
//        TreeMap<Integer,String> tmap4 = new TreeMap<>(tmap);
//        System.out.println(tmap4);
//        System.out.println("-------------------------");
//
//
//        TreeMap<Integer,String> tmap5 = new TreeMap<>(Collections.reverseOrder());      //Comparator.reverseOrder()
//        tmap5.put(3,"Sohini");
//        tmap5.put(2,"Aradhya");
//        tmap5.put(1,"Divya");
//        tmap5.put(4,"Sanjukta");
//        tmap5.put(0,"Mrinal");
//
//        System.out.println(tmap);
//        System.out.println(tmap5);
//
//
//     }
//    public static void main(String[] args) {
//        func1();
//    }
//}
