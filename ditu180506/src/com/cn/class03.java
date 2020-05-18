package com.cn;

import java.util.Scanner;

public class class03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0){
                System.out.println("这个数字为偶数");
            }else if(num % 2 ==1){
                System.out.println("这个数字为奇数");
            }
            System.out.println("请问是否继续");
            String a = sc.next();
            if(a.equals("是")){
                System.out.println("请继续输入一个整数");
            }else if (a.equals("否")){
                break;
            }
        }

    }
}
