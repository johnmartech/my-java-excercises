package com.jmar.oop;

/**
 * Interesting...an abstract class can be defined with no abstract methods. The compiler doesn't complain!
 */
public class Animal extends AbstractLivingThing {

    private final String color;

    public Animal(String color) {
        this.color = color;
    }

}
