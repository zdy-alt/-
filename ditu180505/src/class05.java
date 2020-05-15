import java.util.Scanner;

public class class05 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 1){
            System.out.println(num +"是奇数");
        }else {
            System.out.println("为整数");
        }
    }
}
