package com.adi;

import java.util.Scanner;

public class Type {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float is greater than integer.
        //on left side always write greater thing (eg. float on left side int on right side)
        // float num = input.nextFloat();
        // System.out.print(num);
        // line 9-10 is code its just commented out to work for typecasting.

        // //typecastin in compaitable type.
        // // writing float into int
        // int num = (int) (23.67f);
        // System.out.print(num);


        // automatic type promotin in expression
        // max value to store in byte is 256

        // int a = 257;
        // byte b = (byte) (a);
        // System.out.print(b);


        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c;
        // System.out.print(d);


        // // new
        // int number = 'a';
        // System.out.print(number);
        // // automatic type conversion so here 'a' giver = 97 and 'A' giver 65.


        // System.out.print( 10 * 5 + 40);
        // // it also do calculation like this.


        // //whole summary
        byte b = 20;
        char c = 'a';       // ASCII value of 'a' is 97
        short s = 123;
        int i = 1234;
        float f = 123.123f;
        double d = 1234;

        // Calculate result using the formula
        double result = (b * c) + (s + i) + (f - d);

        // Print intermediate results
        System.out.println("b * c = " + (b * c));
        System.out.println("s + i = " + (s + i));
        System.out.println("f - d = " + (f - d));

        // Print final result
        System.out.println("Result = " + result);
    }
}