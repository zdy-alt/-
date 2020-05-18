package com.cn;

import java.util.Scanner;
//        1.	用户登录系统，如果用户名和密码正确，则输出登陆成功，
//        如果用户名或密码不正确，则登陆失败，并显示还有2次机会（共3次机会），
//        如果三次都错误，则退出程序。（10分）
public class class04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
        System.out.println("请输入用户名");
        String txtName = sc.next();
        System.out.println("请输入密码");
        int passWord = sc.nextInt();
            if (txtName.equals("admin") && passWord == 123){
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("登陆失败,你还有"+(2-i)+"次机会");
                if ((2-i) == 0){
                    break;
                }
            }
            i++;
        }while (i<3);

    }
}
