package com.darkside.fb;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FizzBuzzTwo {
    /**
     * Method that produces the following for any contiguous range of integers:
     * the number
     * ‘fizz’ for numbers that are multiples of 3
     * ‘buzz’ for numbers that are multiples of 5
     * ‘fizzbuzz’ for numbers that are multiples of 15
     *  If the number contains a three the text ‘lucky’ will be output. This overrides previous behaviour.
     *
     * @param lowerBound lower range number
     * @param upperBound upper range number
     * @return the output String
     */
    public String fizzBuzzness(int lowerBound, int upperBound)
    {
        List<Integer> theList = IntStream.rangeClosed(lowerBound, upperBound).boxed().collect(toList());

        List<String> output = theList.stream()
                .map(s ->
                {
                    if (s == 0) {
                        return s.toString() + " ";
                    }
                    else if (s.toString().contains("3")){
                        return "lucky ";
                    }
                    else if (s % 15 == 0){
                        return "fizzbuzz ";
                    }
                    else if (s % 5 == 0){
                        return "buzz ";
                    }
                    else if (s % 3 == 0){
                        return "fizz ";
                    }
                    else {
                        return s.toString() + " ";
                    }
                }).collect(toList());

        return output.stream().reduce("", String::concat).trim();
    }
}
