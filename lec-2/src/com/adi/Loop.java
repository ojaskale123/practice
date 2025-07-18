package com.adi;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // // print num as you want.

        // // Ask user for the limit
        System.out.print("Enter the value of n: ");
        // int n = input.nextInt();

        // System.out.println("Printing numbers from 0 to " + n + ":");

        // // Loop from 0 to n
        // // "fori" = gives you syntax of loop.
        // for (int i = 0; i <= n; i++) {
        // System.out.println(i);

        // practice
        int n = input.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }
    }
}