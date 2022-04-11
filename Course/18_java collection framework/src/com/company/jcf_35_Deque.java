//package com.company;
//
//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Stack;
//
//public class jcf_35_Deque {
//    public static void func1(){
//        Deque<Integer> ad = new ArrayDeque<>();
//
//        ad.add(1);
//        ad.addLast(2);
//        ad.addFirst(3);
//        System.out.println(ad);
//
//        ad.offer(4);        //add at last
//        ad.offerFirst(5);
//        ad.offerLast(6);
//        System.out.println(ad);
//
//        ad.push(7);     //add at first
//        System.out.println(ad);
//        ad.add(8);
//        ad.add(9);
//        ad.add(10);
//        ad.add(11);
//        ad.add(12);
//
//        System.out.println(ad.peek() + " " + ad.peekFirst() + " " + ad.peekLast());
//
//        System.out.println(ad.getFirst());
//        System.out.println(ad.getLast());
//
//        System.out.println(ad.remove());        //remove first
//        System.out.println(ad.removeLast());
//        System.out.println(ad.removeFirst());
//        System.out.println(ad);
//
//        System.out.println(ad.poll());
//        System.out.println(ad.pollFirst());
//        System.out.println(ad.pollLast());
//        System.out.println(ad);
//
//        System.out.println(ad.pop());
//        System.out.println(ad);
//
//        System.out.println(ad.contains(6));
//        System.out.println(ad.contains(3));
//
//        System.out.println(ad.size());
//        System.out.println(ad.equals(ad));
//    }
//    public static void func2(){
//        Deque<Integer> dl = new LinkedList<>();
//        dl.add(8);
//        dl.add(9);
//        dl.add(10);
//        dl.add(11);
//        dl.add(12);
//        System.out.println(dl);
//    }
//    public static void main(String[] args) {
////        func1();
////        func2();
//
//    }
//}
