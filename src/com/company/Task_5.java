package com.company;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), val;
        for (int i = 0; i < n; i++) {
            val = in.nextInt();
            while (val > 9) {
                val /= 10;
            }
            System.out.print(val);
        }
    }
}
