//1: Create a class and a method with deprecated annotation. What is its effect on program execution?
//    Suppress the warning
//    Create an interface and generate an instance from it.

//package com.company;
//
//@FunctionalInterface
//interface I1{
//    void meth2();
//}
//
//class C1{
//    @Deprecated
//    public void meth1(){
//        System.out.println("I am deprecated !");
//    }
//}
//
//public class ARRY_83_practice_16 {
//    public static void main(String[] args) {
//        @SuppressWarnings("deprecated")
//        C1 c = new C1();
//        c.meth1();
//
//        I1 i = ()->{
//            System.out.println("lambda expressions !");
//        };
//        i.meth2();
//    }
//}

//-------------------------------------------------------------------------------------------------------------------------

////2.Write a Java program to generate a multiplication table of a given number and write it to a file.

//package com.company;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class ARRY_83_practice_16 {
//
//    public static void mulTable(int a){
//        String path = "D:\\Study\\Programming\\Java\\Course\\chapter_16_advanced java 2\\java files demo\\MulTable\\multable of "+a+".txt";
//
//        int result;
//        String s = "Multiplication Table of "+a;
//        for (int i = 1; i < 11; i++) {
//            result = a*i;
//            s = s+"\n"+a+" x "+i+" = "+result;
//        }
//        //writing to a file
//        try {
//            FileWriter mulTable = new FileWriter(path);
//            mulTable.write(s);
//            mulTable.close();
//            System.out.println("File generated successfully !");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 10; i++) {
//            mulTable(i);
//        }
//
//
//    }
//}

////-------------------------------------------------------------------------------------------------------------------------
















