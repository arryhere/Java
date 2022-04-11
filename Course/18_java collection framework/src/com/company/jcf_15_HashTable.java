//package com.company;
//
//import java.util.Enumeration;
//import java.util.Hashtable;
//import java.util.Map;
//import java.util.Set;
//
//public class jcf_15_HashTable {
//    public static void hashtable1(){
//        Hashtable<Integer,String> ht1 = new Hashtable<>();
//        ht1.put(1,"Rahul");
//        ht1.put(2,"Karan");
//        ht1.put(3,"Divya");
//        ht1.put(4,"Roshni");
//        ht1.put(5,"Sandeep");
//
//        Hashtable<Integer,String> ht2 =  (Hashtable<Integer,String>)ht1.clone();
//        ht2.put(6,"Surro");
//        System.out.println(ht2);
//
//        System.out.println(ht1.get(1));
//        System.out.println(ht1.remove(2));
//        System.out.println(ht1.containsKey(1));
//        System.out.println(ht1.containsValue("Karan"));
//
//        ht1.putAll(ht2);
//        System.out.println(ht1);
//
//        System.out.println(ht1.keySet());
//        System.out.println(ht1.values());
//
//        System.out.println(ht1.getOrDefault(6,"-1"));;
//
//        Enumeration<String> e = ht1.elements();
//        while (e.hasMoreElements()){
//            System.out.println(e.nextElement());
//        }System.out.println("-----------------------");
//
//        Set<Map.Entry<Integer,String>> es = ht1.entrySet();
//        for(Map.Entry<Integer,String> o:es){
//            System.out.println(o.getKey() + " " + o.getValue());
//        }System.out.println("-----------------------");
//
//        System.out.println(ht1);
//        System.out.println(ht2);
//        System.out.println(ht1.equals(ht2));
//
//        System.out.println(ht1.hashCode());
//    }
//    public static void main(String[] args) {
//        hashtable1();
//    }
//}
