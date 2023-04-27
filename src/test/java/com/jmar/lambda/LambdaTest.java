package com.jmar.lambda;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaTest {


    @Test
    public void test_Lambda() {
         Consumer<String> myConsumer = (str) -> System.out.println(str);
         myConsumer.accept("Hello There!");

    }
}
