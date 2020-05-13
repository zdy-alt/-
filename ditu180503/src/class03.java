import java.util.Scanner;

public class class03 {
    public static void main(String[] args) {
        System.out.println("**********消费单***********");
        System.out.println("品名\t单价(￥)\t\t数量\t金额(￥)");
        System.out.println("钢笔\t25.0\t\t20\t\t500.0");
        System.out.println("笔记本\t3.0\t\t\t10\t\t30.0");
        System.out.println("书架\t10.0\t\t5\t\t50.0");
        int discount = 9;
        System.out.println("折扣:"+ discount +"折");
        int zong = 580;
        System.out.println("金额合计:￥580");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客交的费:");
        int money = sc.nextInt();
        System.out.println("找钱:￥"+ (money - zong));
        int i = zong / 100;
        int n = 0;
        for (int z = 0 ;z < i;z++){
            n+= 3;
        }
        System.out.println("本次购物所得积分为:"+ n);
    }
}
