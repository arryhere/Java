//package com.company;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//public class jcf_33_PriorityQueue {
//    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(); //Comparator.reverseOrder(), Collections.reverseOrder()
//        pq.add(750);
//        pq.add(50);
//        pq.add(250);
//        pq.add(100);
//        pq.add(5);
//        System.out.println(pq);
//        System.out.println(pq.peek());
//
//        System.out.println(pq.poll());
//        System.out.println(pq);
//
//        System.out.println(pq.element());
//        System.out.println(pq);
//
//        System.out.println(pq.offer(33));
//        System.out.println(pq);
//
//        pq.removeIf(n -> (n % 2 != 0));
//        System.out.println(pq);
//
//    }
//}
