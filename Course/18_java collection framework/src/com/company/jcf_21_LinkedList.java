////LL is default class in java
////It can be used a List , Stack , Queue
////It allows null entry
////Dynamic collection
////Insertion and deletion can be easily implemented
////Can contain duplicate elements
////It is not synchronized(not thread safe)
////LL manipulation is fast as we do  not need shifting compared to an array
//
//
//package com.company;
//
//import java.util.*;
//
//public class jcf_21_LinkedList {
//    public static void ll1(){
//        List<Integer> l = new LinkedList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(l);
//        l.removeIf(num -> num%2==0);
//        System.out.println(l);
//        System.out.println(l.get(1));
//
//        LinkedList<String> l2 = new LinkedList<>();
//        System.out.println(l2.size());
//        l2.add("rahul");
//        l2.add("arry");
//        l2.add("divya");
//        l2.add("rohini");
//        System.out.println(l2.size());
//        System.out.println(l2);
//        System.out.println(l2.get(2));
//        System.out.println(l2.getLast());
//        System.out.println(l2.getFirst());
//        System.out.println(l2.getClass());
//        System.out.println(l2.indexOf("rahul"));
//        System.out.println(l2.set(1,"ravi"));
//        System.out.println(l2.retainAll(l2));
//        System.out.println(l2.isEmpty());
//        System.out.println("-----------------");
//        Iterator<String> itl2 = l2.iterator();
//        while (itl2.hasNext()){
//            System.out.println(itl2.next());
//        }
//        System.out.println("-----------------");
//        for (String s:l2){
//            System.out.println(s);
//        }
//        System.out.println("-----------------");
//        System.out.println(l2);
//        l2.add(2,"vidhi");
//        System.out.println(l2);
//        System.out.println("-----------------");
//
//
//        LinkedList<String> l3 = new LinkedList<>();
//        l3.add("modi");
//        l3.add("obama");
//        l3.add("trump");
//        System.out.println(l3.equals(l2));
//        l3.addAll(0,l2);
//        System.out.println(l3);
//        l3.addFirst("salman");
//        l3.addLast("srk");
//        System.out.println(l3);
//        l3.remove(0);
//        System.out.println(l3);
//        l3.remove("srk");
//        System.out.println(l3);
//        l3.removeAll(l2);
//        System.out.println(l3);
//        l3.removeFirst();
//        l3.removeLast();
//        System.out.println(l3);
//        l3.clear();
//        System.out.println(l3);
//
//        LinkedList<String> l4 = new LinkedList<>(Arrays.asList("java","python","c","c#","javascript"));
//        Iterator<String> itrl4 = l4.descendingIterator();
//        while(itrl4.hasNext()){
//            System.out.println(itrl4.next());
//        }
//        for(String o : l4){
//            System.out.println(o);
//        }
//        Collections.sort(l4);
//        System.out.println(l4);
//        Collections.sort(l4,Collections.reverseOrder());
//        System.out.println(l4);
//
//
//        String [] s = new String[l4.size()];
//        l4.toArray(s);
//        System.out.println(Arrays.toString(s));
//
//    }
//    public static void main(String[] args) {
//        ll1();
//    }
//}
