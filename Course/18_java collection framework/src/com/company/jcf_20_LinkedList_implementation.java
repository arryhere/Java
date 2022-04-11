//package com.company;
//
//public class jcf_20_LinkedList_implementation {
//    static Node head;
//
//    static class Node{
//        int data;
//        Node next;
//
//        public Node(int data){
//            this.data = data;
//            next = null;
//        }
//    }
//
//    public static void printLinkedList(){
//        Node n = head;
//        while(n != null){
//            System.out.print(n.data+" ");
//            n = n.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//
//        Node n0 = new Node(10);
//        head = n0;
//
//        Node n1 = new Node(20);
//        n0.next = n1;
//
//        Node n2 = new Node(30);
//        n1.next = n2;
//
//        printLinkedList();
//
//    }
//}
