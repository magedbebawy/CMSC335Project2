package com.company;

public class Controller {

    static double getAreaOfCircle(double radius) {

        return new Circle(radius).getArea();
    }
    static double getAreaOfSquare(double side) {

        return new Square(side).getArea();
    }
    static double getAreaOfTriangle(double base , double height) {

        return new Triangle(base, height).getArea()/2;
    }
    static double getAreaOfRectangle(double base , double height) {

        return new Rectangle(base, height).getArea();
    }
    static double getAreaOfSphere(double radius) {

        return new Sphere(radius).getArea();
    }
    static double getAreaOfCube(double edge) {

        return new Cube(edge).getArea();
    }
    static double getAreaOfCone(double radius, double height) {

        return new Cone(radius, height).getArea();
    }
    static double getAreaOfCylinder(double radius, double height) {

        return new Cylinder(radius, height).getArea();
    }
    static double getAreaOfTorus(double mainRadius, double minorRadius) {

        return new Torus(mainRadius, minorRadius).getArea();
    }

}
