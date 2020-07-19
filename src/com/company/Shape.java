package com.company;


public class Shape {

    int numberOfDimensions;
    String name;

    Shape(int d, String n) {
        numberOfDimensions = d;
        name = n;
    }

    int getNumberOfDimensions() {
        return numberOfDimensions;
    }


    String getName() {
        return name;
    }
}

//-----------------------------------------------------------------------

class TwoDimensionalShape extends Shape {

    double dimension1;
    double dimension2;

    TwoDimensionalShape(double d1, double d2, String name) {
        super(2, name);
        dimension1 = d1;
        dimension2 = d2;
    }

    public double getArea() {
        return dimension1 * dimension2 ;
    }
}

//-----------------------------------------------------------------------

class ThreeDimensionalShape extends Shape {

    double dimension1;
    double dimension2;
    double dimension3;

    ThreeDimensionalShape(double d1, double d2, double d3, String name) {
        super(3, name);
        dimension1 = d1;
        dimension2 = d2;
        dimension3 = d3;
    }

    public double getArea() {
        return dimension1 * dimension2 * dimension3 ;
    }
}

//-----------------------------------------------------------------------



class Circle extends TwoDimensionalShape{

    public Circle(double radius) {
        super(radius, radius * Math.PI, "Circle");
    }

}

//-------------------------------------------------------------------------

class Square extends TwoDimensionalShape{

    public Square(double side) {
        super(side, side, "Square");
    }
}

//--------------------------------------------------------------------------

class Triangle extends TwoDimensionalShape{

    public Triangle(double base, double height) {
        super(base, height, "Triangle");
    }
}

//--------------------------------------------------------------------------

class Rectangle extends TwoDimensionalShape{

    public Rectangle(double width, double length) {
        super(width, length, "Rectangle");
    }
}

//-----------------------------------------------------------------------

class Sphere extends ThreeDimensionalShape{

    public Sphere(double radius){
        super(4*Math.PI, radius, radius, "Sphere");
    }

}
//------------------------------------------------------------------------

class Cube extends ThreeDimensionalShape{

    public Cube(double edge){
        super(6, edge, edge, "Cube");
    }

}
//------------------------------------------------------------------------

class Cone extends ThreeDimensionalShape{

    public Cone(double radius, double height){
        super(Math.PI, radius, radius + (Math.sqrt(Math.pow(height, 2) + Math.pow(radius,2))), "Cone");
    }

}
//------------------------------------------------------------------------

class Cylinder extends ThreeDimensionalShape{

    public Cylinder(double radius, double height){
        super(2*Math.PI, radius, (height + radius), "Cylinder");
    }

}
//------------------------------------------------------------------------

class Torus extends ThreeDimensionalShape{

    public Torus(double mainRadius, double minorRadius){
        super(4*Math.pow(Math.PI, 2), mainRadius, minorRadius, "Torus");
    }

}
