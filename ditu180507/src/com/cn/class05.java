package com.cn;

import java.util.Scanner;

public class class05 {
    public static void main(String[] args) {
        int i = 0;
        do {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num == 1){
                System.out.println("余额查询\r\n返回主菜单按U或者u");
                String a = sc.next();
                if (a.equals("U")||a.equals("u")){
                    System.out.println("请输入你想要的操作类型:");
                    System.out.println("1.余额查询\t\t\t\t\t2.取款");
                    System.out.println("3.转账\t\t\t\t\t\t4.存款");
                    System.out.println("5.修改密码\t\t\t\t\t6.退卡");
                    System.out.println("请输入你想进行的操作");
                }
            }
            int b = sc.nextInt();
            if (b == 6){
                System.out.println("退卡");
                break;
            }
            i++;
        }while (i<3);
    }
}
