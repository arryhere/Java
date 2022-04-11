////Java Exercise 3: Guess the Number (OOPs Edition)
////  Create a class Game, which allows a user to play "Guess the Number" game once.
////
////  Game should have the following methods:
////  Constructor to generate the random number
////  takeUserInput() to take a user input of number
////  isCorrectNumber() to detect whether the number entered by the user is true
////  getter and setter for noOfGuesses
////  Use properties such as noOfGuesses(int), etc to get this task done!
//
//
//package com.company;
//import javax.sound.midi.Soundbank;
//import java.util.Scanner;
//import java.util.Random;
//
//class Game {
//    private int randNo;
//    private int userInput;
//    private int noOfGuesses = 0;
//
//    public Game() {
//        Random rand = new Random();
//        randNo = rand.nextInt(0,101);
//    }
//
//    public void takeUserInput() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Guess your number : ");
//        userInput = sc.nextInt();
//    }
//
//    public boolean isCorrectNumber() {
//        noOfGuesses++;
//        if (userInput == randNo) {
//         System.out.println("Congrats ! same number\n");
//         return true;
//        }
//        else if (userInput > randNo) {
//         System.out.println("Try smaller number !\n");
//        }
//        else if (userInput < randNo) {
//         System.out.println("Try bigger number !\n");
//        }
//        return false;
//
//    }
//
//    public int getNoOfGuesses(){
//        return noOfGuesses;
//    }
//
//    public int getRandomNo(){
//        return randNo;
//    }
//}
//
//public class ARRY_35_exercise_3 {
//    public static void main(String[] args) {
//        System.out.println("Welcome to number guessing game !");
//        Game player = new Game();
//
//        boolean b = false;
//        while(!b) {
//            player.takeUserInput();
//            b = player.isCorrectNumber();
//        }
//        System.out.printf("The random number : %d\n",player.getRandomNo());
//        System.out.printf("No of guesses : %d\n",player.getNoOfGuesses());
//
//    }
//}
//
//
//
////-------------------------------------------------------------------------------------------------------------------------
