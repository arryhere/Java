package com.arry.shape;


public class Circle extends Shape {
    public Circle(int dim1){
        super(dim1, -1);
    }
    public double area(){
        return Math.PI*dim1*dim1;
    }
    
}
