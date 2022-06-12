// 1. Write a program to sum 3 number sin java.

package jc_01_practice_questions;

import java.util.Scanner;

public class pr_01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, sum;
        System.out.print("Enter the first number : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();
        System.out.print("Enter the third number : ");
        c = sc.nextInt();
        sum = a + b + c;
        System.out.print("The sum of three numbers is : ");
        System.out.println(sum);
    }
}
