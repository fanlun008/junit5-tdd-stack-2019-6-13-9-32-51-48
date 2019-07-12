package com.thoughtworks.tdd;

public class FizzBuzz {
    public String convert(Integer source) {

        if (source % 3 == 0) {
            if (source % 5 == 0) {
                if (source % 7 == 0){
                    return "FizzBuzzWhizz";
                }
                return "FizzBuzz";
            } else if (source % 7 == 0){
                return "FizzWhizz";
            }
            return "Fizz";
        }
        if (source % 5 == 0) {
            if (source % 7 == 0) {
                return "BuzzWhizz";
            }
            return "Buzz";
        }
        if (source % 7 == 0) {
            return "Whizz";
        }

        return String.valueOf(source);

    }
}
