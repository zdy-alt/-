import java.util.Scanner;

public class class02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("书店管理销售系统>会员管理");
        System.out.println("***********************");
        System.out.println("1.显示所有客户信息");
        System.out.println("2.添加客户信息");
        System.out.println("***********************");
        System.out.println("请选择");
        int one = sc.nextInt();
        if (one == 1 ){
            System.out.println("显示所有客户信息");
        }else if (one == 2){
            System.out.println("添加客户信息");
        }

    }
}
