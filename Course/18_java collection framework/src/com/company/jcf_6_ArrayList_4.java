//package com.company;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//class Employee{
//    String name;
//    int age;
//    String dept;
//    int id;
//
//    public Employee(String name, int age, String dept, int id) {
//        this.name = name;
//        this.age = age;
//        this.dept = dept;
//        this.id = id;
//    }
//}
//
//public class jcf_6_ArrayList_4 {
//    public static void arraylist4(){
//        Employee e1 = new Employee("Rahul",34,"CSE",1);
//        Employee e2 = new Employee("Divya",23,"Electronics",2);
//        Employee e3 = new Employee("Sunidhi",22,"English",3);
//
//        ArrayList<Employee> a1 = new ArrayList<Employee>();
//        a1.add(e1);
//        a1.add(e2);
//        a1.add(e3);
//
//        System.out.println(a1.get(0).name);
//
//        Iterator<Employee> i1 =  a1.iterator();
//        while(i1.hasNext()){
//            //System.out.println(i1.next().name);
//            Employee emp = i1.next();
//            System.out.println(emp.name+" "+emp.age+" "+emp.dept+" "+emp.id);
//        }
//
//    }
//    public static void main(String[] args) {
//        arraylist4();
//    }
//}
