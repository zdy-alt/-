package com.cn;

import java.util.Scanner;

public class class08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个不大于26的正整数");
        int num = sc.nextInt();
        for (int i = 0; i < num ; i++) {
            for (int j = 1; j <= i+1 ; j++) {
                System.out.print((char) (65 + i));
            }
            System.out.println();
        }
    }
}
