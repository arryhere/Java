// package com.company;

public class jc_01_04_typeOfvariable {
    public static String typeOf(Object x){
        String s = x.getClass().getSimpleName();
        return s;
    }
    public static void main(String[] args) {
        float b = 12.3F;
        System.out.println(typeOf((Object)b));;
    }
}
