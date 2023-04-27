package com.jmar.assessments;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayManipulation {

    public void syntaxCheck(int [] a) {
        int [] b = new int [a.length];
    }

    @Test
    public void test_arrayManipulation() {
        int [] a = new int[] {1, 2, 3, 4, 5};
        int [] b = arrayManipulation(a);
        for(int i = 0; i < b.length; i++) {
            System.out.printf("[%s] = %s\n", i, b[i]);
        }

        System.out.println("---------- Array from sample question -------------------");

        a = new int[] {4, 0, 1, -2, 3};
        b = arrayManipulation(a);
        for(int i = 0; i < b.length; i++) {
            System.out.printf("[%s] = %s\n", i, b[i]);
        }

        System.out.println("-----------------------------");

        a = new int[] {1, 2, 3};
        b = arrayManipulation(a);
        for(int i = 0; i < b.length; i++) {
            System.out.printf("[%s] = %s\n", i, b[i]);
        }

        System.out.println("-----------------------------");

        a = new int[] {1, 2};
        b = arrayManipulation(a);
        for(int i = 0; i < b.length; i++) {
            System.out.printf("[%s] = %s\n", i, b[i]);
        }

        System.out.println("-----------------------------");

        a = new int[] {1};
        b = arrayManipulation(a);
        for(int i = 0; i < b.length; i++) {
            System.out.printf("[%s] = %s\n", i, b[i]);
        }

        System.out.println("-----------------------------");

        a = new int[] {};
        b = arrayManipulation(a);
        for(int i = 0; i < b.length; i++) {
            System.out.printf("[%s] = %s\n", i, b[i]);
        }
    }

    public int [] arrayManipulation(int [] a) {

        int [] b = new int[a.length];

        for(int i = 0; i < a.length; i++) {

            if (a.length == 1) {
                b[i] = a[i];
            } else if(i == 0) {
                b[i] = a[i] + a[i + 1];
            } else if (i == a.length - 1) {
                b[i] = a[i - 1] + a[i];
            } else {
                b[i] = a[i - 1] + a[i] + a[i + 1];
            }
        }
        return b;
    }

}

