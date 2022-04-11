//package com.company;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
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
//public class jcf_12_HashMap {
//    public static void hashmap2(){
//        HashMap<Integer,Employee> hm2 = new HashMap<Integer,Employee>();
//
//        Employee e1 = new Employee("Rahul",34,"CSE",100);
//        Employee e2 = new Employee("Divya",23,"Electronics",101);
//        Employee e3 = new Employee("Sunidhi",22,"Electrical",102);
//        Employee e4 = new Employee("Vivek",41,"Civil",103);
//        Employee e5 = new Employee("DC",31,"Mechanical",104);
//
//        hm2.put(1,e1);
//        hm2.put(2,e2);
//        hm2.put(3,e3);
//        hm2.put(4,e4);
//        hm2.put(5,e5);
//
//        for(Integer k:hm2.keySet()){
//            System.out.println("Key : "+k+" Value : "+" "+hm2.get(k).name+" "+hm2.get(k).age+" "+hm2.get(k).dept+" "+hm2.get(k).id);
//        }
//
//
//    }
//
//    public static void hashmap1(){
//        HashMap<Integer,String> hm1 = new HashMap<>();
//        hm1.put(1,"Java");
//        hm1.put(2,"Python");
//        hm1.put(3,"C");
//        hm1.put(4,"C++");
//        hm1.put(5,"JavaScript");
//
//        System.out.println(hm1);
//        System.out.println(hm1.get(2)+" "+hm1.get(99));
//
//        //
//        for(Map.Entry e : hm1.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
//
//        System.out.println(hm1.remove(5));;
//        System.out.println(hm1);
//
//        //
//        for(Integer k:hm1.keySet()){
//            System.out.println(k+" "+hm1.get(k));
//        }
//
//        HashMap<String,String> hm2 = new HashMap<>();
//        hm2.put("Car","Hundai");
//        hm2.put("Bike","Pulsar");
//        hm2.put("Plane","Boeing");
//        hm2.put("Boat","Lamborghini");
//        hm2.put("Cycle","BMX");
//        hm2.put(null,"Bandra");
//        hm2.put(null,"Bombay");
//        System.out.println(hm2);
//        System.out.println(hm2.get(null));
//
////        hm2.clear();
//        System.out.println(hm2);
//
//        //iterator using keyset
//        Iterator<String> it = hm2.keySet().iterator();
////        while(it.hasNext()){
////            System.out.print(it.next());
////            System.out.println(hm2.get(it.next()));
////        }
//        while(it.hasNext()){
//            String key = it.next();
//            String value = hm2.get(key);
//            System.out.println(key+" "+value);
//        }
//        System.out.println("-------------------------------------");
//
//        //iterator entry set
//        Iterator<Entry<String,String>> it2 =  hm2.entrySet().iterator();
//        while(it2.hasNext()){
//            Entry<String,String> e = it2.next();
//            String key = e.getKey();
//            String value = e.getValue();
//            System.out.println(key + " " + value);
//        }
//        System.out.println("-------------------------------------");
//
//        //foreach lambda
//        hm2.forEach((k,v) -> System.out.println(k + " " + v));
//        System.out.println("-------------------------------------");
//
//    }
//    public static void main(String[] args) {
//        hashmap1();
////        hashmap2();
//    }
//}
