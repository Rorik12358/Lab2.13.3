package com.brainacad.oop.testshapes;

/**
 * Created by R2-D2 on 29.02.2016.
 */
public class Rectangle extends Shape implements Comparable{
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width*height;
    }

    @Override
    //“This is Rectangle, color: RED, width=11, height=22”
    public String toString() {
        return "This is Rectangle, color: "+getShapeColor()+", width="+width+", height="+height;
    }
    @Override
    // This is Rectangle, color: RED, width=11, height=22,  area is: 242
    public void draw() {
        System.out.println(this.toString()+" area is: "+calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle)o;
        if(this.calcArea()>rectangle.calcArea())return 1;
        if(this.calcArea()<rectangle.calcArea())return -1;
        return 0;
    }
}