package com.logicalProgramming;

public class Fibonacci {
        static int fibonacci(int number)
        {
            if (number <= 1)
                return number;
            return fibonacci(number - 1) + fibonacci(number - 2);
        }

        public static void main(String args[])
        {
            int number = 9;
            System.out.println(fibonacci(number));
        }
}
