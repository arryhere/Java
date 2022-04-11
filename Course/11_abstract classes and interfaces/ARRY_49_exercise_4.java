////Java Tutorial: Exercise 4 - Online Library
////    You have to implement a library using Java Class "Library"
////
////    Methods: addBook, issueBook, returnBook, showAvailableBooks
////    Properties: Array to store the available books,
////    Array to store the issued books
//
//package com.company;
//import java.util.Scanner;
//
//class Library{
//    public String [] books;
//    public int no_of_books;
//
//    public Library(){
//        this.books = new String[100];
//        this.no_of_books = 0;
//    }
//    public void addBooks(String book){
//        this.books[no_of_books] = book;
//        no_of_books++;
//        System.out.printf("'%s' - has been added !\n",book);
//    }
//    public void showAvailableBooks(){
//        //System.out.printf("Total n.o of books : %d\n",no_of_books);
//        System.out.println("Books available : ");
//        for (int i=0;i<books.length;i++){
//            if(books[i] == null){
//                continue;
//            }
//            System.out.println("* "+books[i]);
//        }
//    }
//    public void issueBook(String book){
//        for (int i=0;i<books.length;i++){
//            if(book.equals(null)){
//                continue;
//            }
//            if(book.equals(this.books[i])){
//                System.out.printf("Book : '%s' - has been issued !\n",book);
//                books[i] = null;
//                break;
//            }
//        }
//    }
//    public void returnBook(String book){
//        this.books[no_of_books] = book;
//        no_of_books++;
//        System.out.printf("Book : '%s' - has been returned !\n",book);
//    }
//}
//
//public class ARRY_49_exercise_4 {
//    public static void main(String[] args) {
//        Library centralLibrary = new Library();
//
//        //add books
//        centralLibrary.addBooks("Theory of Everything");
//        centralLibrary.addBooks("Da Vinci Resolve");
//        System.out.println("");
//
//        //show books
//        centralLibrary.showAvailableBooks();
//        System.out.println("");
//
//        //issue books
//        centralLibrary.issueBook("Theory of Everything");
//        System.out.println("");
//
//        //show books
//        centralLibrary.showAvailableBooks();
//        System.out.println("");
//
//        //return books
//        centralLibrary.returnBook("Theory of Everything");
//        System.out.println("");
//
//        //show books
//        centralLibrary.showAvailableBooks();
//        System.out.println("");
//
//        //System.out.println(centralLibrary.books[0]);
//    }
//}
//
////-------------------------------------------------------------------------------------------------------------------------