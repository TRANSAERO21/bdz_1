package com.company;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), ret = 0;
        while (ret * ret < n) {
            ret += 1;
        }
        System.out.print(ret - 1);
    }
}
