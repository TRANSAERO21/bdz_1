package com.company;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int old = in.nextInt(), reversed = 0, helper = old;
        while (helper >= 1) {
            reversed = reversed * 10 + helper % 10;
            helper /= 10;
        }
        System.out.print(old == reversed ? "Yes" : "No");
    }
}
