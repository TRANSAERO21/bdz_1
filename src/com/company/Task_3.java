package com.company;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val, sum = 0, ret = 0;
        while (true) {
            val = in.nextInt();
            if (val == 0) break;
            sum += val;
        }
        while (ret * ret < sum) {
            ret += 1;
        }
        System.out.print(ret - 1);
    }
}
