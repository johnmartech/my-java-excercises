package com.jmar.streams;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {


    @Test
    public void streamObjectMethods() {
        System.out.println("------------------- streamObjectMethods ------------------------");
        Method[] methods = Object.class.getMethods();
        Arrays.stream(methods).forEach(o -> System.out.println(o.getName()));

    }

    @Test
    public void sumArray() {
        int[] numbers = IntStream.range(1, 6).toArray();
        System.out.printf("numbers = %s %n", Arrays.toString(numbers));

        int sum = Arrays.stream(numbers).sum();
        System.out.printf("sum = %d %n", sum);

    }

    @Test
    public void filterIntArray() {
        int [] numbers = IntStream.range(1, 10).toArray();

        int [] numbersFiltered = Arrays.stream(numbers)
                .filter(n -> {
                    System.out.println("filter: " + n);
                    return n > 3;
                })
                .toArray();

        Arrays.stream(numbersFiltered).forEach(System.out::println);
    }

    @Test
    public void intArrayToSet() {
        System.out.println("---------intArrayToSet------------");
        int [] numbers = IntStream.range(1, 10).toArray();

        Set<Integer> set = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toSet());

        set.stream().forEach(System.out::println);
    }

    @Test
    public void stringListToString() {
        System.out.println("---------stringListToString------------");
        List<String> list = Arrays.asList("s", "o", "r", "r", "y");
        String str = list.stream()
                .collect(Collectors.joining());
        System.out.println("str = " + str);
    }

    @Test void intArrayToStringArray() {
        System.out.println("---------intArrayToStringArray------------");

        int [] integers = new int[]{1, 2, 3, 4, 5, 6};
        System.out.printf("integers[] = %s%n", Arrays.toString(integers));

        String [] strings = Arrays.stream(integers)
                .mapToObj(Integer::toString)
                .toArray(String[]::new);
        //List<String> strings = Arrays.stream(integers).mapToObj(Integer::toString).collect(Collectors.toList());
        System.out.printf("strings[] = %s%n", Arrays.toString(strings));
    }

    @Test void intArrayToIntegerList() {
        System.out.println("---------intArrayToIntegerList------------");

        int [] array = new int[]{1,2 ,3};
        System.out.printf("array[] = %s%n", Arrays.toString(array));

        List<Integer> list = Arrays.stream(array).mapToObj(Integer::valueOf).collect(Collectors.toList());
        System.out.printf("list = %s%n", list);
    }

    @Test void integerListToString() {

        List<Integer> list = Arrays.asList(1, 2, 3);
        //List<Integer> list = Arrays.asList(IntStream.range(1, 10).toArray());

    }

    @Test void sortList() {
        System.out.println("----------------------- sortList ---------------------");

        List<Integer> list = IntStream.range(1, 10).boxed().collect(Collectors.toList());
        System.out.printf("list (original order) = %s%n", list);

        list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.printf("list (reverse order) = %s%n", list);

        list = list.stream().sorted().collect(Collectors.toList());
        System.out.printf("list (order) = %s%n", list);

    }

    @Test void listStringToArrayString() {
        System.out.println("----------------------- listStringToArrayString ---------------------");

        List<String> list = Arrays.asList("one", "two");
        System.out.printf("list of strings = %s%n", list);

        String [] array = list.stream().toArray(String[]::new);
        System.out.printf("array of strings = %s%n", Arrays.toString(array));

    }

    @Test void test_groupDishes() {
        String [][] dishes = new String [][] {
                {"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
            {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
            {"Quesadilla", "Chicken", "Cheese", "Sauce"},
            {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}
        };
        groupDishesSolution(dishes);
    }

    /**
     * Stream and functional programming.
     * Source: CodeSignal | puzzle name = groupDishes | author = Vitaly_R
     * @param dishes
     * @return
     */
    String [][] groupDishesSolution(String [][] dishes) {
        final Map<String, Set<String>> map = new TreeMap<>();

        for (String[] dish : dishes) {
            final String name = dish[0];
            for (int i = 1; i < dish.length; i++) {
                map.computeIfAbsent(dish[i], v -> new TreeSet<>()).add(name);
            }
        }

        return map.entrySet().stream().filter(e -> e.getValue().size() > 1).map(e -> {
            final String[] array = new String[e.getValue().size() + 1];
            array[0] = e.getKey();
            int offset = 1;
            for (String item : e.getValue()) {
                array[offset++] = item;
            }
            return array;
        }).toArray(String[][]::new);
    }
}
