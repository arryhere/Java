//package com.company;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class jcf_14_waysToMakeHashMap {
//    public static Map<String,Integer> marksMap;
//    static {
//        marksMap = new HashMap<>();
//        marksMap.put("a",100);
//        marksMap.put("b",200);
//    }
//    public static void main(String[] args) {
//        //normie way
//        Map<String,String> map1 = new HashMap<>();
//        HashMap<String,String> map2 = new HashMap<>();
//
//        //static way
//        System.out.println(jcf_14_waysToMakeHashMap.marksMap.get("a"));
//
//        //immutable map with one single entry
//        Map<String,Integer> map3 =  Collections.singletonMap("test",345);
//        System.out.println(map3);
//            //map3.put("hello",43);   //UnsupportedOperationException
//
//
//
//    }
//}
