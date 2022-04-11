package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            String s = "123456789";
            int chunk = 2;
            ArrayList<String> as = new ArrayList<>();

            for(int i=0; i<s.length() ; i=i+chunk){
                as.add(s.substring(i, Math.min(s.length(), i+chunk)));
            }
            System.out.println(as);
        }
}