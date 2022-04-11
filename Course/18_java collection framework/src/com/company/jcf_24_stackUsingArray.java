//package com.company;
//
//public class jcf_24_stackUsingArray {
//    private int size;
//    private int [] arr;
//    private int top;
//
//    public jcf_24_stackUsingArray(int size){
//        this.size = size;
//        this.arr = new int[this.size];
//        this.top = -1;
//    }
//    public void displayStack(){
//        if(isEmpty()){
//            System.out.println("Stack Empty");
//        }
//        else{
//            for(int i=0;i<=top;i++){
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//        }
//    }
//    public boolean isEmpty(){
//        if(top == -1){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public boolean isFull(){
//        if(top == size-1){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public int peek(){
//        if(this.isEmpty()){
//            return -1;
//        }
//        else{
//            return arr[top];
//        }
//    }
//    public void push(int value){
//        if(isFull()){
//            System.out.println("Stack Overflow");
//        }
//        else{
//            top++;
//            arr[top] = value;
//        }
//    }
//    public int pop(){
//        if(isEmpty()){
//            System.out.println("Stack Underflow");
//            return -1;
//        }
//        else{
//            int value = arr[top];
//            top--;
//            return value;
//        }
//    }
//
//    public static void main(String[] args) {
//        jcf_24_stackUsingArray stack = new jcf_24_stackUsingArray(5);
//        System.out.println(stack.isEmpty());
//        stack.displayStack();
//
//        stack.push(33);
//        stack.push(44);
//        stack.push(55);
//        stack.push(66);
//        stack.push(77);
//
//        stack.displayStack();
//
//        System.out.println(stack.pop());
//        stack.displayStack();
//
//        stack.push(88);
//        System.out.println(stack.isFull());
//
//        stack.push(99);
//        System.out.println(stack.peek());
//
//    }
//}
