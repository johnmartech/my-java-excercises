package com.jmar.datastructures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {


    @Test
    public void buildAMap() {
        System.out.println("--------- buildMap -----------------");

        List<String> list = Arrays.asList("one", "two", "three", "four");
        System.out.printf("List = %s %n", list);

        Map<String, Integer> map = list.stream().collect(Collectors.toMap(value -> value, value -> value.length()));
        System.out.printf("List to Map = %s %n", map);
    }
}
