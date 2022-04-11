//package com.company;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class jcf_4_ArrayList_2 {
//    public static void arraylist2(){
//         List<String> languages = new ArrayList<String>();
//         languages.add("java");
//         languages.add("c");
//         languages.add("python");
//         languages.add("c#");
//         languages.add("JavaScript");
//
//         ArrayList<String> colors = new ArrayList<String>();
//         colors.add("blue");
//         colors.add("green");
//         colors.add("yellow");
//
//         for (int i = 0; i < languages.size(); i++) {
//             System.out.println(languages.get(i));
//         }
//
//         for (String lang : languages){
//             System.out.println(lang);
//         }
//
//         System.out.println(languages);
//         System.out.println(languages.size());
//         System.out.println(languages.contains(colors.get(0)));
//         System.out.println(languages.containsAll(colors));
//
//
//         languages.addAll(colors);
//         System.out.println(languages);
//
//         languages.addAll(1,colors);
//         System.out.println(languages);
//
//         languages.clear();
//         System.out.println(languages);
//
//         ArrayList<String> cloneLang =(ArrayList<String>)colors.clone();
//         System.out.println(cloneLang);
//
//         System.out.println(languages.indexOf("python"));
//         System.out.println(languages.indexOf("ruby"));
//         System.out.println(languages.indexOf("python")>0);
//
//         List<String> names = new ArrayList<String>(Arrays.asList("arry","roy","shivam","lisa","arry","titu"));
//         System.out.println(names);
//         System.out.println(names.lastIndexOf("arry"));
//
//         languages.remove("python");
//         languages.remove(1);
//         System.out.println(languages);
//
//         List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
//         numbers.removeIf(num -> num%2==0);
//         System.out.println(numbers);
//
//         List<String> names2 = new ArrayList<String>(Arrays.asList("arry","roy","shivam","lisa","arry","titu"));
//         names2.retainAll(Collections.singleton("arry"));
//         System.out.println(names2);
//         System.out.println(names2.get(1));
//
//         List<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
//         List<Integer> num2 = new ArrayList<Integer>(num1.subList(1,4));
//         System.out.println(num2);
//
//         List<String> fruits = new ArrayList<String>(Arrays.asList("apple","guave","banana","mango","grapes","apple"));
//         Object [] arr = new Object[fruits.size()];
//         arr = fruits.toArray();
//         System.out.println(Arrays.toString(arr));
//
//         List<Integer> num = new ArrayList<>();
//         num.add(1);
//         num.add(2);
//         num.add(3);
//         num.add(4);
//         num.add(5);
//         int [] ar = new int[num.size()];
//         for (int i = 0; i < num.size(); i++) {
//             ar[i] = num.get(i);
//         }
//         System.out.println(Arrays.toString(ar));
//
//         List<Integer> num3 = new ArrayList<>();
//         num3.add(1);
//         num3.add(2);
//         num3.add(3);
//         num3.add(4);
//         num3.add(5);
//         Integer [] arr2 = new Integer[num2.size()];
//         num2.toArray(arr2);
//         System.out.println(Arrays.toString(arr2));
//
//
//         String [] a = {"apple","guave","banana","mango","grapes"};
//         List<String> l1 = new ArrayList<String>(Arrays.asList(a));
//         System.out.println(l1);
//
//         Character [] a2 = {'a', 'b', 'c', 'd', 'e'};
//         List<Character> l2 = new ArrayList<Character>(Arrays.asList(a2));
//         System.out.println(l2);
//
//       Integer [] a3 = {1,2,3,4,5};
//       List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(a3));
//       System.out.println(l3);
//
//    }
//    public static void main(String[] args) {
//        arraylist2();
//        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        ArrayList<Integer> a2 = new ArrayList<>(a1);
//        System.out.println(a2);
//
//        Object [] arr = a1.toArray();
//        Integer [] arr1 = new Integer[arr.length];
//        for(int i=0; i<arr.length; i++){
//            arr1[i] = (int) arr[i];
//        }
//
//        System.out.println(Arrays.toString(arr1));
//
//    }
//}
