package com.jmar.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScratchPad {


    @Test
    public void test_Module() {
        System.out.println("0 % 3 = " + (0 % 3));   // 0
        System.out.println("1 % 3 = " + (1 % 3));   // 1
        System.out.println("2 % 3 = " + (2 % 3));   // 2
        System.out.println("3 % 3 = " + (3 % 3));   // 0
        System.out.println("4 % 3 = " + (4 % 3));   // 1
        System.out.println("5 % 3 = " + (5 % 3));   // 2
    }

    @Test
    public void test_StringToArray() {
        /**
         * Converts a string to an array
         */
        String str1 = "donotbefooledagain";
        System.out.printf("str1 = %s%n", str1);

        String [] str1Array = str1.split("");

        System.out.printf("str1Array = %s%n", Arrays.toString(str1Array));
    }

    @Test
    public void test_StringArrayToList() {
        String [] strArray = {"a","b", "c"};
        System.out.printf("str1Array = %s%n", Arrays.toString(strArray));

        List<String> strList = Arrays.asList(strArray);

        System.out.printf("strList = %s%n", strList);
    }

    @Test
    public void multiDimArray() {
        int [][] twoDimArray = new int [][]{
                {0, 0, 0},
                {1, 1, 1}
        };

        // Get the length of first array in the array. It doesn't matter which array we
        // get they should all have the same length.
        System.out.println("twoDimArray width = " + twoDimArray[0].length);

        System.out.println("twoDimArray:");
        for(int [] array : twoDimArray) {
            System.out.println(Arrays.toString(array));
        }
    }

    @Test
    public void powerOfTwo() {
//        int result = 2^2;
//        Math.pow(2,2);
        //System.out.println("Math.pow(2,2) = " + (Math.pow(2,1)));

        for(int a = 2; a <= 64; a = a + 2) {

            System.out.printf("Power of 2? %s : %s%n", a, isPowerOfTwo(a));
//        Assertions.assertFalse(isPowerOfTwo(a), a + " is a power of 2");

        }
    }

    @Test
    public void listStringToString() {

        // 1: Using String.join()
        List<String> list = Arrays.asList("5", "2", "1");

        String str = String.join("", list);
        System.out.println("list to string (String.join) = " + str);

        // 2: Using streams
        str = list.stream().reduce("", String::concat);
        System.out.println("list<String> to string (stream.reduce) = " + str);

    }

    @Test
    public void listIntToString() {

        // 1: Using String.join()
        List<Integer> list = Arrays.asList(5, 2, 1);


        // 2: Using streams
        String str = list.stream().map(i -> Integer.toString(i)).reduce("", String::concat);
        System.out.println("list<Integer> to string (stream.reduce) = " + str);

    }

    @Test
    public void arrayIntToString() {

        // 1: Using String.join()
        int [] numbers = new int []{5, 2, 1};


        // 2: Using streams
        String str = Arrays.stream(numbers).mapToObj(i -> Integer.toString(i)).reduce("", String::concat);
        System.out.println("list<Integer> to string (stream.reduce) = " + str);

    }

    @Test
    public void testManualStringParse() {

    }
    @Test
    public void manualStringParse() {
        System.out.printf("-------------------manualStringParse-----------------%n");
        String str = "This is my string YEAH";

        System.out.printf("string = %s%n", str);

        int index1 = 0;
        int index2 = 1;

        List<String> list = new ArrayList<>();
        // Parse the sentence into words manually and
        // store in an array.
        boolean done = false;
        while(index2 <= str.length()) {
            if(str.substring(index1, index1 + 1).equals(" ")) {
                index1++;
                if(index1 >= index2) {
                    index2 = index1 + 1;
                }
                continue;
            }
            if(index1 >= index2) {
                index2 = index1 + 1;
            }

            // look for the delimiter, in our case " "
            if(index2 == str.length() || str.substring(index2, index2 + 1).equals(" ")) {
                list.add(str.substring(index1, index2));
                index1 = index2 + 1;
                index2 = index1 + 1;
            } else {
                index2++;
            }
        }
        System.out.printf("List = %s%n", list);
    }
    @Test
    public void arrayEquals() {

        int [] a = new int[]{1,2,3};
        int [] b = new int[]{1,2,3};

        System.out.printf("a[] == b[]? %s%n", Arrays.equals(a,b));

    }


    /**
     * Determines if a number is a power of 2.
     * For example: 8 is a power of 2, i.e. 2 * 2 * 2 = 8 = 2 ^ 3
     * @param a The number to test
     * @return true if a is a power of 2
     */
    private boolean isPowerOfTwo(int a) {

        int result = a;
        boolean done = false;

        while (!done && result > 1) {

            if (result % 2 == 0) {
                result = result / 2;
            } else {
                done = true;
            }
        }
        return result == 1;
    }

}
