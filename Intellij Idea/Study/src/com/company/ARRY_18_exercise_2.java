//package com.company;
//import java.util.Scanner;
//import java.util.Random;
//
//public class ARRY_18_exercise_2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random rand = new Random();
//
//        char user;
//        char comp = 0;
//
//        //welcome message
//        System.out.println("<|Rock Paper Scissor Game|>");
//        System.out.println("<|Choose : 'r' or 'p' or 's'|> ");
//
//
//        //random no generator ; initializing comp
//        int randNo = rand.nextInt(1,4);
//        System.out.println(randNo);
//        if (randNo == 1) {
//            comp = 'r';
//        }
//        else if (randNo == 2) {
//            comp = 'p';
//        }
//        else if (randNo == 3) {
//            comp = 's';
//        }
//
//        //user input
//        System.out.print("Enter your choice ! : ");
//        user = sc.next().charAt(0);
//
//        System.out.println(comp + user);
//
//        //game logic
//        int result = 0;
//
//        if (user == comp) {
//            result = 0;
//        }
//        else if (user == 'r') {
//            if (comp == 's') {
//                result = result + 1;
//            }
//            else if (comp == 'p') {
//                result = result - 1;
//            }
//        }
//        else if (user == 'p') {
//            if (comp == 'r') {
//                result = result + 1;
//            }
//            else if (comp == 's') {
//                result = result - 1;
//            }
//        }
//        else if (user == 's') {
//            if (comp == 'p') {
//                result = result + 1;
//            }
//            else if (comp == 'r') {
//                result = result - 1;
//            }
//        }
//
//
//        //result logic
//        if (result == 0) {
//            System.out.println("Its a TIE");
//        }
//        else if (result == 1) {
//            System.out.println("You WON");
//        }
//        else if (result == -1) {
//            System.out.println("You LOST");
//        }
//
//
//    }
//}
