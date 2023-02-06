package com.logicalProgramming;

public class PerfectNumber {
    static boolean isPerfect(int number) {
        // 1 is not a perfect number
        if (number == 1)
            return false;
        // initialised sum with 1
        int sum = 1;

        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) {

                if (i * i == number)
                    sum += i;
                else
                    sum += i + (number / i);
            }
        }

        if (sum == number)

            return true;

        return false;
    }

    public static void main(String[] args) {
        int n = 6;
        // check if the number is perfect or not.
        if (isPerfect(n))

            System.out.println(n + " is a perfect number");

        else
            System.out.println(
                    n + " is not a perfect number");
    }
}

