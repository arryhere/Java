//package com.company;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class jcf_08_removeDupsElement {
//    public static void rde(){
//        List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9));
//        Set<Integer> set = new LinkedHashSet<>(num);
//        System.out.println(set);
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
//        //
//        List<Integer> num2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9));
//        List<Integer> num3 = num2.stream().distinct().collect(Collectors.toList());
//        System.out.println(num3);
//
//    }
//    public static void main(String[] args) {
//        rde();
//    }
//}
