package com.cn;

import java.util.Scanner;

public class class09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个不大于26的正整数");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {//行
            for (int j = 1; j <= num-i ; j++) {//空格
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {//列
                System.out.print((char) (65+i-1));
            }
            System.out.println();
        }
    }
}
