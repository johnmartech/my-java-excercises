package com.jmar.oop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PolyMorphism {


    public static void main(String[] args) {
        System.out.println("-------------- PolyMorphism.main() -----------------------");

        Shape circle = new Circle(10);
        System.out.println("Circle = " + circle.getSize());

        Shape shape = new Shape(10);
        System.out.println("Shape = " + shape.getSize());

        /**
         * We're able to add both Shape and Circle objects to the List<Shape> list
         * This is possible since Circle extends Shape.
         */
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(shape);
        System.out.println("ShapeList = " + shapeList);
    }

    @Test
    public void test_ListWithDifferentTypes() {

        List<Number> numberList = new ArrayList<>();
        numberList.add(new Integer(10));
        numberList.add(new Float(10.1));

        System.out.println("numberList = " + numberList);

    }

}

class Shape {
    int size;
    Shape(int size) {
        this.size = size;
    }
    int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "" + this.size;
    }

}

class Circle extends Shape {
    final static int PI = 3;
    Circle(int size) {
        super(size);
    }

    @Override
    int getSize() {
        return super.getSize() * PI;
    }

    public String toString() {
        return "" + this.getSize();
    }
}
