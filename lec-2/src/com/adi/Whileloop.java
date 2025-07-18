package com.adi;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // syntax:-
        // while (condition) {
        // body }

        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num += 1;
        }
        // we can do this thing same as i looop for 'n' number like we done in loop

        // do {
        // this thing } while (condition)

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 10);

    }
}