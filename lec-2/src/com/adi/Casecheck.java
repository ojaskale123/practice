package com.adi;

import java.util.Scanner;

public class Casecheck {
    // check it is uppercaseor loweercase.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if (ch > 'a' && ch < 'z') {
            System.out.println(ch + " = this is loweercase");
        } else {
            System.out.println(ch + "= this is uppercase");
        }
    }
}