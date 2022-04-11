//package com.company;
//
//public class jcf_32_QueueUsingArray {
//    int capacity;
//    int [] queueArr;
//    int front;
//    int rear;
//    int currentSize;
//
//    public jcf_32_QueueUsingArray(int sizeOfQueue){
//        this.capacity = sizeOfQueue;
//        this.queueArr = new int[this.capacity];
//        this.front = 0;
//        this.rear = -1;
//        this.currentSize = 0;
//    }
//
//    public boolean isFull(){
//        if(currentSize == capacity){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public boolean isEmpty(){
//        if(currentSize == 0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public void enqueue(int data){
//        if(isFull()){
//            System.out.println("Queue Overflow");
//        }
//        else{
//            if(rear == capacity -1){
//                rear = 0;
//                queueArr[rear] = data;
//                currentSize++;
//            }
//            else {
//                rear++;
//                queueArr[rear] = data;
//                currentSize++;
//            }
//        }
//    }
//    public int dequeue(){
//        if(isEmpty()){
//            System.out.println("Queue Underflow");
//            return -1;
//        }
//        else{
//            if(front == capacity-1){
//                int data = queueArr[front];
//                front = 0;
//                currentSize--;
//                return data;
//            }
//            else{
//                int data = queueArr[front];
//                front++;
//                currentSize--;
//                return data;
//            }
//        }
//    }
//
//    public void printQueue(){
//        if(isEmpty()){
//            System.out.println("Queue Empty");
//        }
//        else if(rear > front){
//            for(int i=front ; i<= rear; i++){
//                System.out.print(queueArr[i] + " ");
//            }
//            System.out.println();
//        }
//        else if(rear < front){
//            for(int i=front ; i<= capacity-1; i++){
//                System.out.print(queueArr[i] + " ");
//            }
//            for(int i=rear ; i< front; i++){
//                System.out.print(queueArr[i] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        jcf_32_QueueUsingArray q = new jcf_32_QueueUsingArray(5);
//        System.out.println(q.isEmpty());
//        System.out.println(q.isFull());
//
//        q.printQueue();
//
//        q.enqueue(23);
//        q.enqueue(34);
//        q.enqueue(22);
//        q.enqueue(53);
//        q.enqueue(58);
//        q.enqueue(69);
//        q.printQueue();
//
//        q.dequeue();
//        q.printQueue();
//
//        q.enqueue(69);
//        q.printQueue();
//
//        System.out.println(q.isFull());
//
//    }
//}
