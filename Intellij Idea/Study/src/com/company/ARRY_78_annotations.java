//package com.company;
//
//@FunctionalInterface
//interface I1{
//    void methI1();
//    //void methI2();
//}
//
//class C1{
//    public void meth1(){
//        System.out.println("meth1 C1");
//    }
//    public void meth2(){
//        System.out.println("meth2 C1");
//    }
//}
//
//class C2 extends C1{
//    @Override
//    public void meth1(){
//        System.out.println("meth1 C2");
//    }
//    @Deprecated
//    public void meth3(){
//        System.out.println("deprecated");
//    }
//}
//
//public class ARRY_78_annotations {
//    public static void main(String[] args) {
//        @SuppressWarnings("Deprecation")
//        C2 c = new C2();
//        c.meth1();
//        c.meth2();
//        c.meth3();
//    }
//}
//
//
////-------------------------------------------------------------------------------------------------------------------------