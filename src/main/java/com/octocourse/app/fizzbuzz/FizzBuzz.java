package com.octocourse.app.fizzbuzz;

import java.util.stream.IntStream;

class FizzBuzz {

    String convert(int start, int end) {
        return IntStream
                .range(start, end + 1)
                .mapToObj(String::valueOf)
                .reduce("", (fizzBuzz, currentValue) -> fizzBuzz.concat(applyRules(Integer.valueOf(currentValue))));
    }

    private String applyRules(int currentNumber) {
        if (isAMultipleOf(15, currentNumber))
            return "FizzBuzz";
        if (isAMultipleOf(3, currentNumber))
            return "Fizz";
        if (isAMultipleOf(5, currentNumber))
            return "Buzz";
        return String.valueOf(currentNumber);
    }

    private boolean isAMultipleOf(int multiple, int currentNumber) {
        return currentNumber % multiple == 0;
    }

}
