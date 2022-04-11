//package com.company;
//
//import java.util.*;
//
//public class jcf_13_compareHashMap {
//    public static void compareHashMap(){
//        HashMap<Integer,String> map1 = new HashMap<>();
//        map1.put(1,"A");
//        map1.put(2,"B");
//        map1.put(3,"C");
//
//        HashMap<Integer,String> map2 = new HashMap<>();
//        map2.put(3,"C");
//        map2.put(1,"A");
//        map2.put(2,"B");
//
//        HashMap<Integer,String> map3 = new HashMap<>();
//        map3.put(1,"A");
//        map3.put(2,"B");
//        map3.put(3,"C");
//        map3.put(3,"D");
//
//        //equals method
//        System.out.println(map1.equals(map2));
//        System.out.println(map1.equals(map3));
//
//        System.out.println("--------------------------");
//
//        //key set compare
//        System.out.println(map1.keySet().equals(map2.keySet()));
//        System.out.println(map1.keySet().equals(map3.keySet()));
//
//        System.out.println("--------------------------");
//
//        //find extra keys
//        HashMap<Integer,String> map4 = new HashMap<>();
//        map4.put(1,"A");
//        map4.put(2,"B");
//        map4.put(3,"C");
//        map4.put(4,"D");
//
//        HashSet<Integer> hs = new HashSet<>(map1.keySet());
//        hs.addAll(map4.keySet());
//        hs.removeAll(map1.keySet());
//        System.out.println(hs);
//
//        System.out.println("--------------------------");
//
//        //compare maps by values
//        HashMap<Integer,String> map5 = new HashMap<>();
//        map5.put(1,"A");
//        map5.put(2,"B");
//        map5.put(3,"C");
//
//        HashMap<Integer,String> map6 = new HashMap<>();
//        map6.put(4,"A");
//        map6.put(5,"B");
//        map6.put(6,"C");
//
//        HashMap<Integer,String> map7 = new HashMap<>();
//        map7.put(7,"A");
//        map7.put(8,"B");
//        map7.put(9,"C");
//        map7.put(10,"C");
//            //duplicates not allowed
//        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
//        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
//
//        ArrayList<String> l1 = new ArrayList<>(map5.values());
//        System.out.println(l1);
//
//            //duplicates allowed
//        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
//        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));
//
//        System.out.println("--------------------------");
//
//
//    }
//    public static void main(String[] args) {
//        compareHashMap();
//    }
//}
