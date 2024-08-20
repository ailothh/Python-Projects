package src;

import java.util.Scanner;

// Base class Shape
 public abstract class Shape {
	String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Getter for name variable
    public String getName() {
        return name;
    }
    public abstract double getArea();
}

// Subclass Rectangle
class Rectangle extends Shape {
	double length;
    double width;

    // Constructor
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter
    public void setWidth(double width) {
        this.width = width;
    }

    // Implementation of getArea 
    @Override
    public double getArea() {
        return length * width;
    }
}

// Subclass Circle
class Circle extends Shape {
     double radius;
     double PI = 3.14159;

    // Constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementation of getArea
    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}

