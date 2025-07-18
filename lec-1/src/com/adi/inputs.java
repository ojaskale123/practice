package com.adi;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("tell me your rollno i will keep it safe:");
        int rollno = input.nextInt();
        System.out.println("your rollno is " + rollno);
        // first working code.
        // lets try new thin.

        int a = 100_000_000;
        System.out.println(a);
        // // here '10' is a literal.

        float marks = input.nextFloat();
        System.out.println(marks);

    }
}