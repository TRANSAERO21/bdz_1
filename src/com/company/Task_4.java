package com.company;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max_1 = 0, max_2 = 0, max_3 = 0, max_4 = 0, max_5 = 0;
        while (true) {
            int val = in.nextInt();
            if (val == 0) {
                break;
            }
            if (val > max_1) {
                if (val > max_2) {
                    max_1 = max_2;
                    if (val > max_3) {
                        max_2 = max_3;
                        if (val > max_4) {
                            max_3 = max_4;
                            if (val > max_5) {
                                max_4 = max_5;
                                max_5 = val;
                            } else {
                                max_4 = val;
                            }
                        } else {
                            max_3 = val;
                        }
                    } else {
                        max_2 = val;
                    }
                } else {
                    max_1 = val;
                }
            }
        }
        System.out.print(max_5 + " " + max_4 + " " + max_3 + " " + max_2 + " " + max_1);
    }
}
