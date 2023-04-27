package com.jmar.math;

import java.util.Arrays;
import java.util.Random;

public class Bits {


    static public int[] randomBitGenerator(int numberOfBits) {
        Random random = new Random();
        int [] ints = random.ints(numberOfBits, 0, 2).toArray();

        System.out.printf("Random bits = %s%n", Arrays.toString(ints));

        return ints;
    }

}
