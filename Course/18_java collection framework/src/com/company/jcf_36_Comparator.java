//package com.company;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class MyComparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
////        if(o1 > o2){
////            return +1;
////        }
////        else{
////            return -1;
////        }
//
//        if(o1%100 > o2%100){      //sort by last 2 digits
//            return +1;
//        }
//        else{
//            return -1;
//        }
//    }
//}
//
//public class jcf_36_Comparator {
//    public static void main(String[] args) {
//        List<Integer> v = new ArrayList<>();
//        v.add(309);
//        v.add(998);
//        v.add(774);
//        v.add(233);
//        v.add(881);
//
//        Comparator<Integer> comp = new MyComparator();
//
//        Collections.sort(v,comp);
//        //Collections.reverse(v);
//
//        System.out.println(v);
//    }
//}
