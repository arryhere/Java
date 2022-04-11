//package com.company;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class jcf_25_stackUsingLinkedList {
//    static Node head;
//    static class Node{
//        int data;
//        Node next;
//    }
//    public static void displayStack(){
//        if(isEmpty()){
//            System.out.println("Stack Empty");
//        }
//        else{
//            Node temp = head;
//            ArrayList<Integer> a = new ArrayList<>();
//            while(temp != null){
//                a.add(temp.data);
//                temp = temp.next;
//            }
//            Collections.reverse(a);
//            System.out.println(a);
//        }
//    }
//    public static boolean isEmpty(){
//        if(head == null){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public static void push(int data){
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.next = head;
//        head = newNode;
//    }
//    public static int pop(){
//        if(isEmpty()){
//            System.out.println("Stack Underflow");
//            return -1;
//        }
//        else{
//            int value = head.data;
//            Node temp = head;
//            head = temp.next;
//            temp = null;
//            return value;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        head = null;
//        displayStack();
//
//        push(44);
//        push(55);
//        push(66);
//        push(77);
//        push(88);
//        displayStack();
//
//        System.out.println(pop());
//        displayStack();
//    }
//}
