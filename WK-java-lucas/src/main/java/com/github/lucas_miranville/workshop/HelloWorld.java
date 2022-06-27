package com.github.lucas_miranville.workshop;

public class HelloWorld {

    public static void sayHello () {
        System.out.print("Hello World !\n");
    }

    public static void printStrings (String... args) {
        for (String s : args) {
            System.out.print(s);
        }
    }

    public static void main(String... args) {
        sayHello();
    }
}

