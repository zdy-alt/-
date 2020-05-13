import java.util.Scanner;

public class class04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        find(sc);
    }
    public static void find(Scanner sc){
        System.out.println("请输入你的卡号(4位数字)");
        int number = sc.nextInt();

        System.out.println("您的卡号个位为:" + number % 10);
        System.out.println("您的卡号十位为:" + number % 100 / 10);
        System.out.println("您的卡号百位为:" + number % 1000 / 100 );
        System.out.println("您的卡号千位为:" + number / 1000 );
        int ge = number % 10;
        int shi = number % 100 / 10;
        int bai = number % 1000 / 100;
        int qian = number / 1000;
        System.out.println("您的卡号所有数字之和为:"+ (ge + shi + bai + qian));
//        String num =((ge + shi + bai + qian) % 8 == 0) ? "中奖" : "没中";
        boolean num = ((ge + shi + bai + qian) % 8 == 0)?true:false;
        System.out.println(num);
    }
}
