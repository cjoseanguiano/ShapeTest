package com.devix.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Shape shape = new Circle(10);
        shape.draw();
        System.out.println("Area: " + shape.getArea());

        shape = new Rectangle(10, 10);
        shape.draw();
        System.out.println("Area: " + shape.getArea());
    }
}
