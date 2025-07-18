package com.adi;

import java.util.Scanner;

public class Large {
    public static void main(String[] args) {12
        Scanner input = new Scanner(System.in);
        System.out.println("give me num1");
        int a = input.nextInt();
        System.out.println("give me num2");
        int b = input.nextInt();
        System.out.println("give me num3");
        int c = input.nextInt();
        // fing largestt no. among three num.
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("largest value is = " + max);
    }
}