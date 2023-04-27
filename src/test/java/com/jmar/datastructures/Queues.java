package com.jmar.datastructures;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queues {


    @Test
    public void testQueue_LinkedList() {
        System.out.printf("--------------------- testQueue ----------------------%n");

        // Create Queue and 'offer' elements to it. Note that 'offer' would not throw and exception if the capacity of
        // the queue had been reached.
        Queue queue = new LinkedList();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        System.out.printf("queue = %s%n", queue);
        // Call 'add' to add more elements to the queue. If there were a capacity limit, and it was reached
        // an exception would be thrown.
        queue.add("5");
        queue.add("6");

        // Iterate over the elements and print each one.
        queue.forEach(System.out::println);

        // Call 'peek'. It should retrieve the head of the queue but not remove it.
        System.out.printf("'peek': call 1 = %s%n", queue.peek());
        System.out.printf("'peek': call 2 = %s%n", queue.peek());
        // call 'element'. Same as 'peek' but would throw an exception if the queue was empty.
        System.out.printf("'element': call 1 = %s%n", queue.element());
        System.out.printf("'element': call 2 = %s%n", queue.element());

        // Poll (remove) each element from the queue and print it.
        while(!queue.isEmpty()) {
            System.out.printf("Error: poll: %s | %s%n", queue.poll(), queue.isEmpty());
        }

        // Try to 'poll' when the queue is empty.
        System.out.println("Try 'poll' on an empty queue. It should return null unlike 'remove'.");
        Object e = queue.poll();
        System.out.printf("queue.poll() on empty queue = %s%n", e);

        // Try to 'remove' from the empty queue. Should throw and exception!
        try {
            System.out.println("Try 'remove' on an empty queue. We should get a NoSuchElementException");

            queue.remove();

        } catch (NoSuchElementException nsee) {
            System.err.printf("ERROR: We tried to remove from the empty queue and got an exception: %s%n", nsee);
        }

    }
}
