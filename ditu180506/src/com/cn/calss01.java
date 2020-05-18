package com.cn;

import java.util.Scanner;

public class calss01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 1;
        for (int i = 1;i <= num;i++){
            a*=i;
        }
        System.out.println("所以"+num+"!的阶层为"+a);
    }
}
