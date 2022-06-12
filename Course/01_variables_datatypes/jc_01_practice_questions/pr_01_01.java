
// Write a program to calculate percentage of a given student in cbse board exam. 
// His marks from 5 subjects must be taken from the keyboard. Marks out of 100.

package jc_01_practice_questions;

import java.util.Scanner;

public class pr_01_01 {

   public static void main(String[] args) {
       float sub1 , sub2 , sub3 , sub4 , sub5 , maxMarks ;
       maxMarks = 100;
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the marks of sub1 : ");
       sub1 = sc.nextFloat();
       System.out.print("Enter the marks of sub2 : ");
       sub2 = sc.nextFloat();
       System.out.print("Enter the marks of sub3 : ");
       sub3 = sc.nextFloat();
       System.out.print("Enter the marks of sub4 : ");
       sub4 = sc.nextFloat();
       System.out.print("Enter the marks of sub5 : ");
       sub5 = sc.nextFloat();

       float percentageTotal = ((sub1+sub2+sub3+sub4+sub5)/(5*maxMarks))*100;

       System.out.print("Your total percentage is : ");
       System.out.println(percentageTotal);
   }
}
