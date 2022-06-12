package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class test {
    public static double area(double base, double height){
        double area = ((double)1/2)*base*height;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args) {
        System.out.println(area(4, 5));
    }
}