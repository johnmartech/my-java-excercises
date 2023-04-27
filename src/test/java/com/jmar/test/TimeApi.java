package com.jmar.test;

import org.junit.jupiter.api.Test;

import java.time.Instant;

public class TimeApi {

    @Test
    public void test_Instant() {
        // Uses Greenwich Mean Time, i.e. +/- 00 hours
        Instant now = Instant.now();
        System.out.println("Instant = " + now);
    }

}
