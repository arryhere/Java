// 5. Write a program to detect whether a number entered by the user is an integer or not.

import java.util.Scanner;

public class pr_01_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        boolean b = sc.hasNextInt();
        System.out.println(b);
        
    }
}
