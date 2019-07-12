package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_given_1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    public void should_return_Fizz_when_given_3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(3);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_given_5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(5);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_FizzWhizz_when_given_21(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(21);
        Assertions.assertEquals("FizzWhizz", result);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_given_105(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(105);
        Assertions.assertEquals("FizzBuzzWhizz", result);
    }

    @Test
    public void testAll(){
        String result = "";
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 20; i++) {
            result += fizzBuzz.convert(i)+"\n";
        }
        Assertions.assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "Whizz\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "Whizz\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n", result);
    }


}
