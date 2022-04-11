//package com.company;
//
//import java.util.*;
//
//public class jcf_10_repeatingElements {
//    public static void main(String[] args) {
//        List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,11,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,1));
//        System.out.println(num);
//
//        Set<Integer> set = new LinkedHashSet<>(num);
//        System.out.println("List without dups : "+set);
//
//        Set<Integer> set2 = new LinkedHashSet<>();
//        for(int i=0;i<num.size();i++){
//            for(int j=i+1;j<num.size();j++){
//                if(num.get(i) == num.get(j)){
//                    set2.add(num.get(i));
//                    break;
//                }
//            }
//        }
//        System.out.println("repeating elements : "+set2);
//
//        List<Integer> num2 = new ArrayList<>(set2);
//        num.removeAll(num2);
//        System.out.println(num);
//    }
//}
