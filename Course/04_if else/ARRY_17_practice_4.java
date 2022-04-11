//1. Write a program to find out whether a student is pass or fail if it requires a total of 40% and at least 33% in each subject to pass.
//   Assume 3 subjects and take marks as input from the user.

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_17_practice_4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float sub1 , sub2, sub3 , maxMarks , totalPercentage , sub1Percent , sub2Percent , sub3Percent;
//
//        System.out.print("Enter the max marks : ");
//        maxMarks = sc.nextFloat();
//
//        System.out.print("Enter the marks for sub1 : ");
//        sub1 = sc.nextFloat();
//
//        System.out.print("Enter the marks for sub2 : ");
//        sub2 = sc.nextFloat();
//
//        System.out.print("Enter the marks for sub3 : ");
//        sub3 = sc.nextFloat();
//
//        sub1Percent = sub1/maxMarks*100;
//        sub2Percent = sub2/maxMarks*100;
//        sub3Percent = sub3/maxMarks*100;
//        totalPercentage = (sub1+sub2+sub3)/(3*maxMarks)*100;
//
//        if (totalPercentage>=40 && sub1Percent>=33 && sub2Percent>=33 && sub3Percent>=33) {
//            System.out.println("You have been promoted !");
//        }
//        else {
//            System.out.println("You are failed !");
//        }
//
//    }
//}


//------------------------------------------------------------------------------------------------------------------------

//2. Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//        Income Slab	Tax
//        2.5L – 5.0L  	5%
//        5.0L – 10.0L 	20%
//        Above 10.0L	30%
//Note that there is not tax below 2.5L. Take the input amount as input from the user.


//package com.company;
//import java.util.Scanner;
//
//public class ARRY_17_practice_4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your income in Lakhs per annum : ");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.printf("The total tax paid by the employee is : %.2f",tax*100000);
//    }
//}

//------------------------------------------------------------------------------------------------------------------------

//3. Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]


//package com.company;
//import java.util.Scanner;
//
//public class ARRY_17_practice_4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number between [1 - 7] : ");
//        int num = sc.nextInt();
//
//        switch (num) {
//            case 1 -> System.out.println("Sunday");
//            case 2 -> System.out.println("Monday");
//            case 3 -> System.out.println("Tuesday");
//            case 4 -> System.out.println("Wednesday");
//            case 5 -> System.out.println("Thursday");
//            case 6 -> System.out.println("Friday");
//            case 7 -> System.out.println("Saturday");
//            default -> System.out.println("Enter a valid range between [1 - 7]");
//        }
//
//    }
//}

//------------------------------------------------------------------------------------------------------------------------

//4. Write a Java program to find whether a year entered by the user is a leap year or not.

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_17_practice_4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the year : ");
//        int year = sc.nextInt();
//
//        if (year%400 == 0) {
//            System.out.println("Its a leap year !");
//        }
//        else if (year%100 == 0) {
//            System.out.println("Its not a leap year !");
//        }
//        else if (year%4 == 0) {
//            System.out.println("Its a leap year !");
//        }
//        else {
//            System.out.println("Its not a leap year !");
//        }
//
//    }
//}

//------------------------------------------------------------------------------------------------------------------------

//5. Write a program to find out the type of website from the URL:
//
//        .com – commercial website
//        .org – organization website
//        .in – Indian website

//package com.company;
//import java.util.Scanner;
//
//public class ARRY_17_practice_4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the website : ");
//        String website1 = sc.nextLine();
//
//        if (website1.endsWith(".com")) {
//            System.out.println("This is a commercial website");
//        }
//        else if (website1.endsWith(".org")) {
//            System.out.println("This is a organizational website");
//        }
//        else if (website1.endsWith(".in")) {
//            System.out.println("This is an Indian website");
//        }
//        else {
//            System.out.println("Not recognized ! try again");
//        }
//    }
//}

//------------------------------------------------------------------------------------------------------------------------
