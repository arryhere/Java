//package com.company;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Iterator;
//
//public class jcf_27_HashSet {
//    public static void f2(){
//        HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(1,3,4,5,6,8,9,10));
//        HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(1,3,5,6,0,9));
//
//        //union
//        HashSet<Integer> union = new HashSet<>();
//        union.addAll(hs1);
//        union.addAll(hs2);
//        System.out.println("union "+union);
//
//        //intersection
//        HashSet<Integer> inter = new HashSet<>();
//        inter.addAll(hs1);
//        inter.retainAll(hs2);
//        System.out.println("inter "+inter);
//
//        //difference
//        HashSet<Integer> diff = new HashSet<>();
//        diff.addAll(hs1);
//        diff.removeAll(hs2);
//        System.out.println("diff "+diff);
//    }
//    public static void f1(){
//        HashSet<String> hs = new HashSet<>();
//        hs.add("Divya");
//        hs.add("Rohini");
//        hs.add("Madhu");
//        hs.add("Bhavika");
//        hs.add(null);
//        System.out.println(hs);
//
//        Iterator<String> i = hs.iterator();
//        while (i.hasNext()){
//            System.out.print(i.next()+" ");
//        }
//        System.out.println();
//
//        hs.remove("Bhavika");
//        System.out.println(hs);
//
//        System.out.println(hs.contains("Madhu"));
//        System.out.println(hs.isEmpty());
//    }
//    public static void main(String[] args) {
//        f1();
////        f2();
//    }
//}
