//package com.company;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class jcf_09_compareArrayList {
//    public static void compareArrayList(){
//        ArrayList<String> a1 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
//        ArrayList<String> a2 = new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
//        ArrayList<String> a3 = new ArrayList<>(Arrays.asList("B","A","C","D","E","F"));
//
//        Collections.sort(a1);
//        Collections.sort(a2);
//        Collections.sort(a3);
//
//        System.out.println(a1.equals(a2));
//        System.out.println(a2.equals(a3));
//
//        //
//        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
//        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("B","A","C","D","E"));
//
//        //additional element
//        ArrayList<String> exeL1 = new ArrayList<>(l1);
//        ArrayList<String> exeL2 = new ArrayList<>(l2);
//        exeL1.removeAll(exeL2);
//
//        System.out.println("additional element : "+exeL1);
//
//        //missing element
//        ArrayList<String> exeL3 = new ArrayList<>(l1);
//        ArrayList<String> exeL4 = new ArrayList<>(l2);
//        exeL4.removeAll(exeL3);
//        System.out.println("missing element : "+exeL4);
//
//        //common element
//        ArrayList<String> exeL5 = new ArrayList<>(l1);
//        ArrayList<String> exeL6 = new ArrayList<>(l2);
//        exeL5.retainAll(exeL6);
//        System.out.println("intersection : "+exeL5);
//
//    }
//    public static void main(String[] args) {
//        compareArrayList();
//    }
//}
