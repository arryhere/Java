//package com.company;
//
//import java.util.Comparator;
//import java.util.TreeSet;
//
//class MyComparator implements Comparator{
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        Integer i1 = (Integer) o1;
//        Integer i2 = (Integer) o2;
//
//        if(i1 < i2){
//            return +1;
//        }
//        else if(i1 > i2){
//            return -1;
//        }
//        else{
//            return 0;
//        }
//    }
//}
//
//public class jcf_30_TreeSet_1 {
//    public static void func1(){
//        TreeSet ts = new TreeSet();
//        ts.add("Divya");
//        ts.add("Sheetal");
//        ts.add("Bhavika");
//        //ts.add(new Integer(10));      //homogeneous objects only
//        //ts.add(null);     //can insert in first only or else nullPointerException
//        System.out.println(ts);
//    }
//    public static void func2(){
//        TreeSet<Integer> ts = new TreeSet<>(new MyComparator());        //Comparator.reverseOrder(), Collections.reverseOrder()
//        ts.add(2);
//        ts.add(5);
//        ts.add(4);
//        ts.add(1);
//        ts.add(3);
//        System.out.println(ts);
//
//        TreeSet<Integer> ts1 = new TreeSet<Integer>();
//        ts1.add(2);
//        ts1.add(5);
//        ts1.add(4);
//        ts1.add(1);
//        ts1.add(3);
//        System.out.println(ts1);
//        ts1.pollFirst();
//        ts1.pollLast();
//        ts1.add(6);
//        ts1.add(7);
//        System.out.println(ts1);
//        System.out.println(ts1.floor(4));
//        System.out.println(ts1.higher(88));
//        System.out.println(ts1.lower(3));
//
//    }
//    public static void main(String[] args) {
////        func1();
////        func2();
////        System.out.println("A".compareTo("A"));
//    }
//}
