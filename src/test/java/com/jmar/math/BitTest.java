package com.jmar.math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BitTest {



    @Test
    public void test_randomBitGenerator() {
        System.out.println("------ test_randomBitGenerator --------------");

        int[] bits = Bits.randomBitGenerator(100);
        System.out.printf("bits = %s %n", Arrays.toString(bits));

    }

    @Test
    public void testMath_Power() {

        System.out.printf("Math.pow(3, 2) = 3^2 = %s%n", Math.pow(3, 2));
    }

    @Test
    public void testMath_binary() {
        Integer  integer = new Integer(37);

        String string = Integer.toBinaryString(integer);
        // consecutive zeros
        int maxCount = 0;
        int count = 0;
        for(char ch : string.toCharArray()) {
            if(ch == '0') {
                ++count;
            } else {
                if(count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        System.out.printf("Max count of consecutive 0s in %s = %d%n", string, maxCount);
    }

    @Test
    public void testMath_binaryShiftLeft() {
        Integer integer = new Integer(9);

        System.out.printf("Number is %d and it's binary form is %s%n", integer, Integer.toBinaryString(integer));

        // consecutive zeros
        int maxCount = 0;
        int count = 0;

        int bitCount = Integer.bitCount(integer);

        for(int bit = 0; bit < bitCount; bit++) {
            System.out.printf("Shift right distance = %s: result = %s%n", bit, Integer.toBinaryString(integer >> bit));
        }
    }

    /**
     * NOT WORKING.
     * The thinking was AND 1 with a specific position within the integer. If the result is 0 then increment
     * the counter, if the result is 1 then save to maxCount (if count > maxCount) and set count = 0.
     */
    @Test
    public void testMath_binaryRotateLeft() {
        Integer  integer = new Integer(9);

        // consecutive zeros
        int maxCount = 0;
        int count = 0;

        int bitCount = Integer.bitCount(integer);
        for(int bit = 0; bit < bitCount; bit++) {
            System.out.printf("Rotate left distance = %s: result = %s%n", bit, Integer.toBinaryString(Integer.rotateLeft(integer, bit)));
            if((Integer.rotateLeft(integer, bit) & 0b1000) == 0) {
                ++count;
            } else {
                if(count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        System.out.printf("Max count of consecutive 0s in %s = %d%n", Integer.toBinaryString(integer), maxCount);
    }
}
