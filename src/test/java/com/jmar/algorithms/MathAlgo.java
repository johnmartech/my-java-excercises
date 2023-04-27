package com.jmar.algorithms;

import org.junit.jupiter.api.Test;

public class MathAlgo {


    @Test
    public void test_Solution() {

        int result = solutionIterative(15);
        System.out.printf("result = %d %n", result);

        result = solutionIterative(12345);
        System.out.printf("result = %d %n", result);

        result = solutionIterative(123456);
        System.out.printf("result = %d %n", result);
    }

    /**
     * THe method takes an integer and adds the digits together. This process
     * is repeated until the result is a single digit.
     * For example:
     * integer = 12345
     * result 1 = 1 + 2 + 3 + 4 + 5 = 15  (Note that the result is 2 digits. Perform the process again)
     * result 2 = 1 + 5 = 6
     * For 12345 the method would return 6.
     *
     * @param integer
     * @return
     */
    private int solutionIterative(int integer) {
        System.out.printf("solutionIterative called: %s %n", integer);

        int result = 0;
        int tempResult = integer;
        boolean done = false;
        while(!done) {
            result += tempResult % 10;
            tempResult = tempResult / 10;
            if(tempResult == 0) {
                if(result < 10) {
                    done = true;
                } else {
                    // start new iteration
                    tempResult = result;
                    result = 0;
                }
            }

        }
        return result;
    }


    private int solutionRecursive(int integer) {
        return 0;
    }
}
