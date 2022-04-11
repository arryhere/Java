//package com.company;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//class Employee{
//    String name;
//    int id;
//    public Employee(String name, int id){
//        this.name = name;
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                '}';
//    }
//}
//
//class MyComparator implements Comparator{
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        Employee e1 = (Employee) o1;
//        Employee e2 = (Employee) o2;
//
//        return e1.id - e2.id;
//    }
//}
//
//class MyComparator2 implements Comparator{
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        Employee e1 = (Employee) o1;
//        Employee e2 = (Employee) o2;
//        return e1.name.compareTo(e2.name);
//    }
//}
//
//public class jcf_34_customPriorityQueue {
//    public static void main(String[] args) {
//        PriorityQueue<Employee> p = new PriorityQueue<>(new MyComparator());
//        p.add(new Employee("A",105));
//        p.add(new Employee("B",101));
//        p.add(new Employee("C",106));
//        p.add(new Employee("D",103));
//        p.add(new Employee("E",110));
//
//        System.out.println(p);
//        System.out.println(p.poll());
//        System.out.println(p.poll());
//        System.out.println(p.poll());
//
////        PriorityQueue<Employee> p1 = new PriorityQueue<>(new MyComparator2());
////        p1.add(new Employee("Divya",101));
////        p1.add(new Employee("Sohini",101));
////        p1.add(new Employee("Divya",102));
////        p1.add(new Employee("Bhavika",101));
////        p1.add(new Employee("Aradhya",101));
////
////        System.out.println(p1);
////        System.out.println(p1.poll());
////        System.out.println(p1);
//
//    }
//}
