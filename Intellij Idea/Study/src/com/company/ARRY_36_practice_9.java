//1. create a class cylinder and use getter and setters to set its radius and height.
//    calculate total surface area and volume of the cylinder
//    Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters

//package com.company;
//
//class Cylinder {
//    private float radius;
//    private float height;
//    private float surfaceArea;
//    private float volume;
//
//    public void setRadius(float r){
//        radius = r;
//    }
//    public float getRadius(){
//        return radius;
//    }
//
//    public void setHeight(float h){
//        height = h;
//    }
//    public float getHeight(){
//        return height;
//    }
//
//    public float surfaceArea(){
//        surfaceArea = 2*3.14f*radius*height + 2*3.14f*radius*radius;
//        return surfaceArea;
//    }
//
//    public float volume(){
//        volume = 3.14f*radius*radius*height;
//        return volume;
//    }
//}
//
//class Rectangle {
//    private int length , breadth;
//
//    public Rectangle() {
//        length = 4;
//        breadth = 5;
//    }
//    public Rectangle(int l,int b) {
//        length = l;
//        breadth = b;
//    }
//    public int getLength(){
//        return length;
//    }
//    public int getBreadth(){
//        return breadth;
//    }
//}
//
//public class ARRY_36_practice_9 {
//    public static void main(String[] args) {
//        Cylinder cy = new Cylinder();
//        Rectangle re = new Rectangle(7,8);
//
//        cy.setRadius(4.5f);
//        cy.setHeight(5.5f);
//        System.out.printf("radius : %f , height : %f\n",cy.getRadius(),cy.getHeight());
//        System.out.printf("surface area : %f , volume : %f\n",cy.surfaceArea(),cy.volume());
//
//        System.out.printf("Length : %d , breadth : %d", re.getLength(),re.getBreadth());
//
//    }
//}

////-------------------------------------------------------------------------------------------------------------------------