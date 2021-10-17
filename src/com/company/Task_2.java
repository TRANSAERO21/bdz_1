package com.company;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), max = in.nextInt(), min = max, sum = max, current;
        for (int i = 0; i < n - 1; i++) {
            current = in.nextInt();
            if (max < current) {
                max = current;
            }
            if (min > current) {
                min = current;
            }
            sum += current;
        }
        System.out.print(max + " " + min + " " + sum / n);
    }
}
