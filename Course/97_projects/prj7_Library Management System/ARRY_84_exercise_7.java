/*
Create a library management system which is capable of issuing books to the students.
    Book should have info like:
    1. Book name
    2. Book Author
    3. Issued to
    4. Issued on
    User should be able to add books, return issued books, issue books
    Assume that all the users are registered with their names in the central database
 */

package com.company;

import java.util.ArrayList;

class Book{
    public String name,author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added");
        this.books.add(book);
    }
    public void returnBook(Book book){
        System.out.println("The book has been returned");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued to "+ issued_to);
        this.books.remove(book);
    }
}
public class ARRY_84_exercise_7 {
    public static void main(String[] args) {
        Book b1 = new Book("Theory of Everything","Stephen Hawkins");
        Book b2 = new Book("NCERT","CBSE");
        Book b3 = new Book("Theory of Physics","HC Verma");

        ArrayList<Book> b = new ArrayList<>();
        b.add(b1);
        b.add(b2);
        b.add(b3);

        Library l = new Library(b);
        l.addBook(new Book("Let us C","CC"));
        l.issueBook(b3,"arry");

        System.out.println(l.books);

    }
}
