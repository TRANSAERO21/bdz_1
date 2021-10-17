package com.company;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        for (int i = 1; i != m + 1; i++) {
            for (int j = 1; j != n + 1; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
