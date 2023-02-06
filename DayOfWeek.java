package com.logicalProgramming;

import java.util.Scanner;
import java.util.*;

public class DayOfWeek {

    static int days[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String name[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input month and date(o o to exit)");

        for (; ; ) {
            int month = input.nextInt(), date= input.nextInt();
            if (month == 0 && date == 0) break;
            System.out.println(solve(month, date));
        }
    }

    static String solve(int month, int date) {
        int current = 3;
        System.out.println("Name of the day:");
        for (int i = 0; i < month - 1; i++) current += days[i];
        current += date - 1;
        return name[current % 7];
    }

}

