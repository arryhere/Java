//package com.company;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
//
//public class jcf_3_ArrayList_1 {
//    public static void arraylist1(){
//        ArrayList<Object> a = new ArrayList<>(33);
//        a.add(34);
//        a.add(200);
//        a.add("String");
//        a.add(12.4);
//        a.add(true);
//        System.out.println(a);
//
//        System.out.println(a.get(1));
//        System.out.println(a.size());
//        a.trimToSize();
//        System.out.println(a);
//
//        ArrayList<Integer> ai = new ArrayList<>();
//        ai.add(45);
//
//        ArrayList<Float> af = new ArrayList<>();
//        af.add(45.4f);
//
//        for(int i=0;i<a.size();i++){
//            System.out.print(a.get(i)+" ");
//        }
//        System.out.print("\n--------------------\n");
//
//        for(Object o:a){
//            System.out.print(o+" ");
//        }
//        System.out.println("\n--------------------\n");
//
//        a.stream().forEach(ele -> System.out.print(ele+" "));
//        System.out.println("\n--------------------\n");
//
//        Iterator<Object> it =  a.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//        System.out.println("\n--------------------\n");
//
//        ArrayList<String> as = new ArrayList<>(Arrays.asList("Java","Python","C"));
//        System.out.println(as);
//    }
//    public static void main(String[] args) {
//        arraylist1();
//    }
//}
