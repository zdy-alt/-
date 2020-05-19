package Examinations;

import java.util.Scanner;

public class class01 {
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
            }
            i++;
        }while (i<3);
    }
}
