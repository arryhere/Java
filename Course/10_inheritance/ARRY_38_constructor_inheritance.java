//package com.company;
//
//class Base{
//    private int x;
//
//    public Base(){
//        System.out.println("I am constructor of Base");
//    }
//    public Base(int a){
//        System.out.println("I am overloaded-constructor of Base -> "+a);
//    }
//
//    public void setX(int x){
//        this.x = x;
//    }
//    public int getX(){
//        return this.x;
//    }
//}
//
//class Derived extends Base {
//    private int y;
//
//    public Derived(){
//        super(5);
//        System.out.println("I am constructor of Derived");
//    }
//    public Derived(int a){
//        super(a);
//        System.out.println("I am overloaded-constructor of Derived -> "+a);
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//    public int getY() {
//        return this.y;
//    }
//}
//
//public class ARRY_38_constructor_inheritance {
//    public static void main(String[] args) {
//        Base b = new Base();
//
//        System.out.println("");
//
//        Derived d = new Derived(66);
//
//    }
//}
//
////-------------------------------------------------------------------------------------------------------------------------