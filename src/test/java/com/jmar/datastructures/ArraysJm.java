package com.jmar.datastructures;

import org.junit.jupiter.api.Test;
import java.util.*;

public class ArraysJm {



    @Test
    public void searchSorted() {

        int [] integers = new int [] {1,2,3,4,5,6,7,8,9,10};

        int index = Arrays.binarySearch(integers, 5, 10, 9);
        System.out.printf("index  for 9 = %d %n", index);
    }


}
