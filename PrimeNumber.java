package com.logicalProgramming;

import java.util.Scanner;

public class PrimeNumber {
    public static Boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter prime number");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + "is a prime number");
        } else {
            System.out.println(number + "is not a prime number");
        }


    }


}

