package com.github.lucas_miranville.workshop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static int rdmInt(int inf, int sup)
    {
        Random rdm = new Random();
        int ret = inf+rdm.nextInt(sup-inf);
        return ret;
    }

    public static void main(String... args){
        Integer rdm = 0;
        if (args.length == 2)
            rdm = rdmInt(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        else
            rdm = rdmInt(1, 100);
        Integer tries = 0;
        Scanner scan = new Scanner(System.in);
        Integer input = 0;

        while (true) {
            System.out.print("Your guess? ");
            input = scan.nextInt();
            if (input.compareTo(rdm) == 0) {
                System.out.println("You win!");
                System.out.println("It took you "+(tries)+" tries");
                return;
            } else if (input.compareTo(rdm) < 0) {
                System.out.println("Too low!");
            } else if (input.compareTo(rdm) > 0) {
                System.out.println("Too high!");
            }
        }
    }
}
