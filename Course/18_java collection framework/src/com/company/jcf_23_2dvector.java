//package com.company;
//
//import java.util.Vector;
//
//public class jcf_23_2dvector {
//    public static void main(String[] args) {
//        Vector<String> v1 = new Vector<>();
//        v1.add("Java");
//        v1.add("Python");
//        v1.add("C");
//
//        Vector<Vector<String>> v2 = new Vector<>();
//        v2.add(v1);
//
//        for(int i=0;i<v1.size();i++){
//            String s = (String)((Vector<?>)v2.get(0)).get(i);
//            System.out.println(s);
//        }
//    }
//}
