package com.jmar.datastructures;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {

    @Test
    public void stackem() {

        // Java doc said to use ArrayDeque instead of the Stack class
        Deque<String> stack = new ArrayDeque<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.printf("stack = %s %n", stack);

        System.out.printf("stack.peek() = %s %n", stack.peek());
        System.out.printf("stack = %s %n", stack);

        System.out.printf("stack.pop() = %s %n", stack.pop());
        System.out.printf("stack = %s %n", stack);

    }
}
