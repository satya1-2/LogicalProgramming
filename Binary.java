package com.logicalProgramming;
import java.util.Scanner;
public class Binary {
        public static void main(String args[])
        {
            int decimal_number, quot, i=1, j;
            int binary_number[] = new int[100];
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a Decimal Number : ");
            decimal_number = scanner.nextInt();

            quot = decimal_number;

            while(quot != 0)
            {
                binary_number[i++] = quot%2;
                quot = quot/2;
            }

        }}
