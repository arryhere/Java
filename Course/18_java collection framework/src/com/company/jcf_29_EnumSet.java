//package com.company;
//
//import java.util.EnumSet;
//import java.util.Iterator;
//
//public class jcf_29_EnumSet {
//     private enum Lang{
//        JAVA,C,PYTHON,JavaScript,Go,Swift,Rust;
//    }
//    public static void main(String[] args) {
//        EnumSet<Lang> e = EnumSet.allOf(Lang.class);
//        System.out.println(e);
//
//        EnumSet<Lang> e1 = EnumSet.noneOf(Lang.class);
//        System.out.println(e1);
//
//        EnumSet<Lang> e2 = EnumSet.range(Lang.JAVA,Lang.Go);        //TO IS INCLUSIVE
//        System.out.println(e2);
//
//        EnumSet<Lang> e3 = EnumSet.of(Lang.PYTHON);
//        System.out.println(e3);
//
//        EnumSet<Lang> e4 = EnumSet.of(Lang.PYTHON,Lang.Rust);
//        System.out.println(e4);
//
//        EnumSet<Lang> e5 = EnumSet.allOf(Lang.class);
//        EnumSet<Lang> e6 = EnumSet.noneOf(Lang.class);
//        e6.add(Lang.JavaScript);
//        System.out.println(e6);
//        e6.addAll(e5);
//        System.out.println(e6);
//
//        EnumSet<Lang> e7 = EnumSet.allOf(Lang.class);
//        Iterator<Lang> i = e7.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//
//        EnumSet<Lang> e8 = EnumSet.allOf(Lang.class);
//        System.out.println(e8);
//        System.out.println(e8.remove(Lang.Go));
//        System.out.println(e8);
//    }
//}
