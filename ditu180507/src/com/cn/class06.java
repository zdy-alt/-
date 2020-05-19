package com.cn;

import java.util.Scanner;

public class class06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("电脑随机生成了一个随机数");
        int a = (int)(Math.random()*100);//电脑随机生成1-100的数字
        System.out.println("请输入你猜的数");
        int num = sc.nextInt();
        while (a!=num){
            if (num > a){
                System.out.println("你猜大了,再猜");
            }else {
                System.out.println("你猜小了,再猜");
            }
            System.out.println("请输入你猜的数");
            num = sc.nextInt();
        }
        System.out.println("恭喜!!!猜对了\r\n你还是很聪明的");
    }
}
