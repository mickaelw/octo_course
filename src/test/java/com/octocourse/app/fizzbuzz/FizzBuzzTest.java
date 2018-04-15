package com.octocourse.app.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void holdStandardNumberWithoutConversion() {
        String standardNumber = "1";

        assertEquals(standardNumber, new FizzBuzz().convert(1, 1));
    }

    @Test
    void convertMultipleOf3ToFizz() {
        assertEquals("Fizz", new FizzBuzz().convert(3, 3));
    }

    @Test
    void convertMultipleOf5ToBuzz() {
        assertEquals("Buzz", new FizzBuzz().convert(5, 5));
    }

    @Test
    void convertMultipleOf15ToFizzBuzz() {
        assertEquals("FizzBuzz", new FizzBuzz().convert(15, 15));
    }

    @Test
    void returnTheConvertedValueBetweenTwoNumbers() {
        String convertedValue = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";

        assertEquals(convertedValue, new FizzBuzz().convert(1, 15));
    }

}
