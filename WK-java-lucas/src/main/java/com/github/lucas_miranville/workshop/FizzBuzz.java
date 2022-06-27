package com.github.lucas_miranville.workshop;

public class FizzBuzz {

    private static boolean is_div (Integer x, Integer div, Integer ddiv) {
        if ((x % div) == 0 && (x % ddiv) == 0)
                return true;
        return false;
    }

    public static void main(String... args) {
        for (Integer i = 1; i < 200; i++) {
            if (is_div(i, 3, 5)) {
                System.out.println( (i) + " -> FizzBuzz");
            }else if ((i % 3) == 0) {
                System.out.println((i) + " -> Fizz");
            } else if ((i % 5) == 0) {
                System.out.println((i) + " -> Buzz");
            } else System.out.println(i);
        }
    }

}
