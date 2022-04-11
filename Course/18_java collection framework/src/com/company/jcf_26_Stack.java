//package com.company;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.Stack;
//
//public class jcf_26_Stack {
//    public static void stack1(){
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//        s.add(0,6);
//        System.out.println(s.pop());
//        System.out.println(s);
//        System.out.println(s.isEmpty());
//        System.out.println(s.empty());
//        System.out.println(s.lastElement());
//        System.out.println(s.firstElement());
//        System.out.println(s.size());
//        System.out.println(s.search(34));
//        System.out.println(s.get(4));
//        System.out.println(s.indexOf(6));
//        System.out.println(s.remove(4));
//        System.out.println("peek " + s.peek());
//        s.set(1,33);
//
//        Iterator<Integer> i = s.iterator();
//        while(i.hasNext()){
//            System.out.print(i.next()+" ");
//        }
//        System.out.println();
//
//        Collections.sort(s,Collections.reverseOrder());
//        System.out.println(s);
//
//        Integer [] arr = new Integer[s.size()];
//        s.toArray(arr);
//        System.out.println(Arrays.toString(arr));
//
//        Object [] o = new Object[s.size()];
//        o = s.toArray();
//    }
//    public static void main(String[] args) {
//        stack1();
//    }
//}
