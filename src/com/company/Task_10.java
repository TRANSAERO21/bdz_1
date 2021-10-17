package com.company;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), bit_a, bit_b, prev = 0, ret = 0, pos = 1;
        boolean skip = false;
        while(a != 0 || b != 0) {
            bit_a = a & 1;
            bit_b = b & 1;
            if (prev == 0) {
                if (bit_a == 1 && bit_b == 1) {
                    skip = true;
                    prev = 1;
                } else if (bit_a == 0 && bit_b == 0) {
                    skip = true;
                } else {
                    skip = false;
                }
            } else {
                if (bit_a == 1 && bit_b == 1) {
                    prev = 1;
                    skip = false;
                } else if (bit_a == 1 || bit_b == 1) {
                    prev = 1;
                    skip = true;
                } else {
                    prev = 0;
                    skip = false;
                }
            }
            // System.out.println("bit_a = "  + bit_a + ", bit_b = " + bit_b + ", skip = " + skip + ", prev = " + prev);
            if (!skip) {
                ret |= pos;
            }
            a >>= 1;
            b >>= 1;
            pos <<= 1;
        }
        if (prev == 1) ret |= pos;
        System.out.println(ret);
    }
}
