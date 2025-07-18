package com.adi;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        // sallery increment
        System.out.println("tell me sallery");
        Scanner input = new Scanner(System.in);
        /*
         * syntax for if else condition:-
         * if(condition) {
         * body or sout
         * } else {
         * }
         */
        int sallery = input.nextInt();
        if (sallery > 10000) {
            sallery = sallery + 2000;
        } else {
            sallery = sallery + 1000;
        }
        System.out.println("your sallery is = " + sallery);

    }
}