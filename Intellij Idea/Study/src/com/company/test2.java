package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare the variable
        int n = sc.nextInt();
        String [] arr = new String [n];

        // Read the variable from STDIN
        for(int i=0; i<n ; i++){
            arr[i] = sc.next();
        }

        ArrayList<String> arr2 = new ArrayList<>();
        for(int i=0; i<n ;i++){
            for(int j=0; j<n ; j++ ){
                if(arr[i].equals(arr[j])){
                    continue;
                }
                else{
                    if(arr[i].contains(arr[j])){
                        arr2.add(arr[j]);
                    }
                }
            }
        }

        // Output the variable to STDOUT

        System.out.println(arr2);
    }
}
