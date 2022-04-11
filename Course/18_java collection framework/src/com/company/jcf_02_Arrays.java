//package com.company;
//
//import java.util.Arrays;
//
//public class jcf_02_Arrays {
//    public static void main(String[] args) {
//        int [] a = {5,4,3,2,1};
//
//        String [] s  = new String[a.length];
//        for (int i = 0; i < a.length; i++) {
//            s[i] = String.valueOf(a[i]);
//        }
//
//        System.out.println(Arrays.toString(s));
//        System.out.println(Arrays.toString(a));
//
//        System.out.println(s[0]+s[1]);
//        System.out.println(a[0]+a[1]);
//
//        Arrays.sort(a);
//        Arrays.sort(s);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(s));
//
//        System.out.println(Arrays.binarySearch(s,"5"));;
//
//        int [] b = {1,2,3,4,5};
//        System.out.println(Arrays.compare(a,b));
//        System.out.println(Arrays.equals(a,b));
//
//        int [] c = Arrays.copyOf(b,10);
//        System.out.println(Arrays.toString(c));
//
//        int [] d = Arrays.copyOfRange(b,1,3);
//        System.out.println(Arrays.toString(d));
//
//    }
//}
