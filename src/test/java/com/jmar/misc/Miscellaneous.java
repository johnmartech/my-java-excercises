package com.jmar.misc;

import java.util.ArrayList;
import java.util.List;

public class Miscellaneous {

    public static final int ONE_MILLION = 1_000_000_000;    // 4/18/2023 - I didn't know you could use "_" like this.

    public void someMethod() {

        // Final is not implied when declaring a variable.
        /*final*/ Integer integer = new Integer(10);
        integer = new Integer(5);
    }
}
