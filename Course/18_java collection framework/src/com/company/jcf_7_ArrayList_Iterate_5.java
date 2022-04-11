//package com.company;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.ListIterator;
//
//public class jcf_7_ArrayList_Iterate_5 {
//    public static void arraylist5(){
//        List<String> names = new ArrayList<>();
//        names.add("Rahul");
//        names.add("Divya");
//        names.add("Sohini");
//        names.add("Devjyoti");
//        names.add("Abhishek");
//
//        //as a list
//        System.out.println(names);
//
//        //for each lambda
//        names.forEach(n ->{
//            System.out.print(n+" ");
//        });
//        System.out.println();
//
//        //iterator
//        Iterator<String> i1 = names.iterator();
//        while(i1.hasNext()){
//            System.out.print(i1.next()+" ");
//        }
//        System.out.println();
//
//        //iterator forEachRemaining lambda
//        Iterator<String> i2 = names.iterator();
//        i2.forEachRemaining(n -> {
//            System.out.print(n+" ");
//        });
//        System.out.println();
//
//        //for each
//        for(String n:names){
//            System.out.print(n+" ");
//        }
//        System.out.println();
//
//        //normie way
//        for(int i=0;i<names.size();i++){
//            System.out.print(names.get(i)+" ");
//        }
//        System.out.println();
//
//        //listIterator , traverse both ways
//        ListIterator<String> li = names.listIterator(names.size());
//        while(li.hasPrevious()){
//            System.out.print(li.previous()+" ");
//        }
//        System.out.println();
//
//        ListIterator<String> li2 = names.listIterator();
//        while(li.hasNext()){
//            System.out.print(li.next()+" ");
//        }
//        System.out.println();
//
//    }
//    public static void main(String[] args) {
//        arraylist5();
//    }
//}
