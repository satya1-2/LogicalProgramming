package com.logicalProgramming;

import java.util.Scanner;

public class ReverseNumberForLoop {
    public static void main(String[] args) {

        int number;
        int reversenum = 0;
        System.out.println("Input your number and press enter: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int temp = number;
        int remendar = 0;

        while (temp > 0) {
            reversenum = reversenum * 10 + remendar;
            remendar = temp % 10;
            temp = temp / 10;
        }

        System.out.println("Reverse of specified number is: " + reversenum);
    }
}


