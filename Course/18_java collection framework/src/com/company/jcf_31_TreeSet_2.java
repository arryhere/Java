//package com.company;
//
//import java.util.Comparator;
//import java.util.TreeSet;
//
//class MyComparator implements Comparator{
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        Employee e1 = (Employee) o1;
//        Employee e2 = (Employee) o2;
//        String s1 = e1.name;
//        String s2 = e2.name;
//
//        return s1.compareTo(s2);
//    }
//}
//
//class Employee implements Comparable{
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
//
//    @Override
//    public int compareTo(Object o) {
//        int id1 = this.id;
//        Employee e = (Employee)o;
//        int id2 = e.id;
//        if(id1 < id2){
//            return -1;
//        }
//        else if(id1 > id2){
//            return +1;
//        }
//        else{
//            return 0;
//        }
//    }
//}
//
//public class jcf_31_TreeSet_2 {
//    public static void main(String[] args) {
//        Employee e1 = new Employee("Divya",101);
//        Employee e2 = new Employee("Sohini",102);
//        Employee e3 = new Employee("Vidhi",103);
//        Employee e4 = new Employee("Avantika",104);
//        Employee e5 = new Employee("Divya",101);
//
//        TreeSet<Employee> t1 = new TreeSet<Employee>();
//        t1.add(e1);
//        t1.add(e2);
//        t1.add(e3);
//        t1.add(e4);
//        t1.add(e5);
//        System.out.println(t1);
//
//
//        MyComparator comp = new MyComparator();
//        TreeSet<Employee> t2 = new TreeSet<Employee>(comp);
//        t2.add(e1);
//        t2.add(e2);
//        t2.add(e3);
//        t2.add(e4);
//        t2.add(e5);
//        System.out.println(t2);
//    }
//}
