package com.adi;

import java.util.Scanner;

public class Fibbonace {
    public static void main(String[] args) {
        // finding nth no. of fibonacae series.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            // temp = temporary value
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}