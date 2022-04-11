//package com.company;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class Laptop implements Comparable<Laptop>{
//    String name;
//    int ram;
//    int price;
//
//    public Laptop(String name, int ram,int price){
//        this.name = name;
//        this.ram = ram;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Laptop{" +
//                "name='" + name + '\'' +
//                ", ram=" + ram +
//                ", price=" + price +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Laptop o) {
//        int old_p = o.price;
//        int new_p = this.price;
//
//        return (new_p - old_p);
//    }
//}
//
//public class jcf_37_Comparable {
//    public static void main(String[] args) {
//
//        List<Laptop> l = new ArrayList<>();
//        l.add(new Laptop("Dell",8,500));
//        l.add(new Laptop("HP",4,200));
//        l.add(new Laptop("Lenovo",16,400));
//        l.add(new Laptop("Apple",32,800));
//        l.add(new Laptop("Toshiba",24,1000));
//
//        Collections.sort(l);
//
//        for(Laptop o : l){
//            System.out.println(o);
//        }
//    }
//}
