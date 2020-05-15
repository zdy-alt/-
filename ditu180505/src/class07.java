import java.util.Scanner;

public class class07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int ge = num % 100 % 10;
        int shi = num % 100 / 10;
        int bai = num / 100;
        if (ge*ge*ge + shi*shi*shi + bai*bai*bai == num){
            System.out.println("这个数为水仙花数");
        }else{
            System.out.println("这个数不是水仙花数");
        }

    }


}
