//1. Create an abstract class pen with methods write () and refill () as abstract methods
//    Use the pen class from Q1 to create a concrete class fountainPen with additional method changeNib ()

//package com.company;
//
//abstract class Pen{
//    abstract public void write();
//    abstract public void refill();
//}
//
//class FountainPen extends Pen{
//    public void write(){
//        System.out.println("write");
//    }
//    public void refill(){
//        System.out.println("refill");
//    }
//    public void changeNib(){
//        System.out.println("changing the nib");
//    }
//}
//
//public class ARRY_48_practice_11 {
//    public static void main(String[] args) {
//        FountainPen p = new FountainPen();
//        p.changeNib();
//    }
//}

////--------------------------------------------------------------------------------------------------------------------------

//2. Create a class monkey with jump ( ) and bite ( ) methods
//Create a class human which inherits this monkey class and implements basic animal interface with eat ( ) and sleep methods.
//Demonstrate polymorphism using monkey  class

//package com.company;
//
//interface BasicAnimal{
//    public void eat();
//    public void sleep();
//}
//
//class Monkey{
//    public void jump(){
//        System.out.println("Jumping...");
//    }
//    public void bite(){
//        System.out.println("Biting...");
//    }
//}
//
//class Human extends Monkey implements BasicAnimal{
//    public void eat(){
//        System.out.println("Eating...");
//    }
//    public void sleep(){
//        System.out.println("Sleeping...");
//    }
//    public void speak(){
//        System.out.println("Hello World...");
//    }
//
//}
//
//public class ARRY_48_practice_11 {
//    public static void main(String[] args) {
//        Human arry = new Human();
//        arry.sleep();
//
//        Monkey arry1 = new Human();
//        arry1.jump();
//
//    }
//}

////--------------------------------------------------------------------------------------------------------------------------

//3. Create an interface TVremote and use it to inherit another interface smart TVremote
//    Create a class TV which implements TVremote interface
//
//package com.company;
//
//interface SmartTvRemote{
//    void playYoutube();
//    void playGames();
//}
//interface TvRemote extends SmartTvRemote{
//    void turnOn();
//    void turnOff();
//}
//
//class Tv implements TvRemote{
//    public void turnOn(){
//        System.out.println("TV is on");
//    }
//    public void turnOff(){
//        System.out.println("TV is off");
//    }
//    public void playYoutube(){
//        System.out.println("Starting Youtube");
//    }
//    public void playGames(){
//        System.out.println("Starting Games");
//    }
//}
//
//public class ARRY_48_practice_11 {
//    public static void main(String[] args) {
//        Tv sony = new Tv();
//    }
//}

////--------------------------------------------------------------------------------------------------------------------------

