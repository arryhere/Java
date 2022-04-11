//package com.company;
//
//import java.util.*;
//
//public class test {
//
//    public static int processTime(List<Integer> processorTime, List<Integer> taskTime){
//        Collections.sort(processorTime);
//        Collections.sort(taskTime,Collections.reverseOrder());
//
//        for(int i=0;i<taskTime.size()/2;i++){
//            int val = taskTime.get(i)+processorTime.get(0);
//            taskTime.remove(i);
//            taskTime.add(i,val);
//        }
//
//        for(int i=taskTime.size()/2;i<taskTime.size();i++){
//            int val = taskTime.get(i)+processorTime.get(1);
//            taskTime.remove(i);
//            taskTime.add(i,val);
//        }
//
//        Collections.sort(taskTime,Collections.reverseOrder());
//        int r = taskTime.get(0);
//        return r;
//    }
//
//    public static void main(String[] args) {
//        int n = 2;
//        Integer [] pt = {8,10};
//        Integer [] tt = {3,1,8,7,4,2,5,2};
//
//        ArrayList<Integer> p = new ArrayList<>();
//        Collections.addAll(p,pt);
//        ArrayList<Integer> t = new ArrayList<>();
//        Collections.addAll(t,tt);
//
//        System.out.println(processTime(p,t));
//
//    }
//}
