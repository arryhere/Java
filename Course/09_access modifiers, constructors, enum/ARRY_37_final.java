// //final access modifier with variables, methods, class
// //capital letter for constants as a convention
// //final variable is constant --> cannot change it
// //final method cannot be overridden
// //final class cannot be extended


// //package com.company;

// /*final*/ class A{
//    final int DAY;
//    public A(){
//        DAY = 10;
//        // DAY = 20;
//    }
//    final public void show(){
//        System.out.println("hello");
//    }
// }
// class B extends A{
// //    public void show(){
// //        System.out.println("hello");
// //    }
// }
// public class ARRY_37_final {
//    public static void main(String[] args) {
//        A obja = new A();
//        System.out.println(obja.DAY);

//        B objb = new B();
//        System.out.println(objb.DAY);
//        objb.show();
//    }
// }