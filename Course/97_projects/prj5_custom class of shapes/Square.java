package com.arry.shape;


public class Square extends Shape {
    public Square(int dim1){
        super(dim1, -1);
    }
    public int area(){
        return this.dim1*this.dim1;
    }
}
