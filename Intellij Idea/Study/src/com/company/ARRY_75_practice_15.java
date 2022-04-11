//1.Create an ArrayList and store the names of ten students inside it. Print it using a for each loop
////
//package com.company;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ARRY_75_practice_15 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> name = new ArrayList<String>();
//
//        for (int i=0;i<10;i++){
//            System.out.printf("Enter the name of student %d - ",i+1);
//            name.add(sc.nextLine());
//        }
//
//        System.out.println(name);
//    }
//}

////-------------------------------------------------------------------------------------------------------------------------

//2.Create a Set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored.
//
//package com.company;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class ARRY_75_practice_15 {
//    public static void main(String[] args) {
//        HashSet<Integer> h = new HashSet<Integer>();
//
//        h.add(1);
//        h.add(1);
//        h.add(2);
//        h.add(3);
//        h.add(4);
//        h.add(3);
//
//        System.out.println(h);
//    }
//}

////-------------------------------------------------------------------------------------------------------------------------

//3.Use the Date class and Calendar class Aand java.time in Java to print the time in the following format : 21:47:02.
//
//package com.company;
//
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Scanner;
//
//public class ARRY_75_practice_15 {
//    public static void main(String[] args) {
//
//        //DATE CLASS
//        Date d = new Date();
//        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
//
//        //CALENDAR CLASS
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
//
//        //java.time
//        LocalTime dt = LocalTime.now();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
//        String time = dt.format(dtf);
//        System.out.println(time);
//    }
//}

////-------------------------------------------------------------------------------------------------------------------------

