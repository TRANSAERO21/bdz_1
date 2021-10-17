package com.company;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), i = 2;
        while (n != 1) {
            if (n  %  i == 0) {
                System.out.print(i);
                if (n == i) {
                    break;
                }
                System.out.print("*");
                n /= i;
                i = 2;
                continue;
            }
            i++;
        }
    }
}
