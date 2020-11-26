package com.company;

public class Main {

    public static void main(String[] args) {
        Circle simple = new Circle(5, 30);
        System.out.println("Area " + simple.getArea());
        System.out.println("Perimeter " + simple.getPerimeter());
        System.out.println(simple.toJSON());
            System.out.println(simple.toXML());
    }
}
