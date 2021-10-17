package com.company;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), max = 0, val;
        for (int i = 0; i < n; i++) {
            val = in.nextInt();
            if (val > max && val % 100 == 11) {
                max = val;
            }
        }
        System.out.print(max);
    }
}
