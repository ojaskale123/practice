package com.adi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
                // give inpput 2 num
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    ans = num1 / num2;
                } else {
                    ans = num1 % num2;
                }
            
            System.out.println("your answer is =" + ans);
        }
    }
}