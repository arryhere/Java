// package com.company;

public class jc_01_03_typecasting {

    public static void widening() {
        int a = 10;
        float b = a;
        System.out.println(a);
        System.out.println(b + "\n");
    }

    public static void typecasting() {
        float a = 10.54F;
        int b = (int) a;
        System.out.println(a);
        System.out.println(b + "\n");
    }

    public static void overflow() {
        int a = 130;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b + "\n");
    }

    public static void Adding_Lower_Type() {
        byte a = 10;
        byte b = 11;
        // byte c = a + b; //as total sum of byte variables can exceed the range of byte
        byte c = (byte) (a + b);
        System.out.println(c + "\n"); // will give garbage value is range of byte is exceeded
    }

    public static void charInt(){
        char c = 'A';
        int i = 65;
        System.out.println((char)i);
        System.out.println((int)c + "\n");
    }

    public static void main(String[] args) {
        widening();
        typecasting();
        overflow();
        Adding_Lower_Type();
        charInt();

    }
}
