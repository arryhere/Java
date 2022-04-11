//package com.company;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//public class jcf_16_threadSafeMaps {
//    public static void tsm1(){
//        Map<Integer,String> map1 = new HashMap<>();
//        map1.put(1,"Divya");
//        map1.put(2,"Sohini");
//        map1.put(3,"Nitika");
//
//        Map<Integer,String> synMap1 = Collections.synchronizedMap(map1);
//        System.out.println(synMap1);
//    }
//
//    public static void tsm2(){
//        Map<Integer,String> map2 = new ConcurrentHashMap<>();
//        map2.put(1,"Java");
//        map2.put(2,"Python");
//        map2.put(3,"C");
//
//        System.out.println(map2);
//    }
//    public static void main(String[] args) {
//        tsm1();
//        tsm2();
//    }
//}
