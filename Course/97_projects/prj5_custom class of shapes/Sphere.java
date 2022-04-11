package com.arry.shape;


public class Sphere extends Shape{
    public Sphere(int dim1){
        super(dim1, -1);
    }
    public double area(){
        return 4*Math.PI*Math.sqrt(dim1);
    }
    
}