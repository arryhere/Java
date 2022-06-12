// package com.company;

public class jc_01_01_variables {
    int a = 44;                                                 //instance variable
    static int b = 33;                                          //static variable
    public static void sum() {
        int num1, num2, num3, sum;                              //local variable
        num1 = 4;
        num2 = 5;
        num3 = 6;
        sum = num1 + num2 + num3;
        System.out.print("The sum of these numbers is : ");
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum();
        System.out.println(new jc_01_01_variables().a);
        System.out.println(b);
    }
}

/*
• Local Variable : A variable declared inside the body of the method
• Instance Variable : A variable declared inside the class but outside the body of the method
• Static variable : Class reference is used to call the variable, single copy of the static variable is created
*/