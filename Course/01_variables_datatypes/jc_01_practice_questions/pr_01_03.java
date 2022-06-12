// 2. Write a program to calculate cgpa using marks of three subjects. (out of 100)

package jc_01_practice_questions;

import java.util.Scanner;

public class pr_01_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        float a,b,c,maxMarks,cgpa;
        maxMarks = 100;
 
        System.out.print("Enter the marks of subject 1 : ");
        a = sc.nextFloat();
        System.out.print("Enter the marks of subject 1 : ");
        b = sc.nextFloat();
        System.out.print("Enter the marks of subject 1 : ");
        c = sc.nextFloat();
 
        cgpa = ((a+b+c)/(3*maxMarks)*100)/10;
        System.out.print("Your cgpa is : ");
        System.out.println(cgpa);
 
    }
}
