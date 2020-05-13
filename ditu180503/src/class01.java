import java.util.Scanner;

public class class01 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个年份");
            int year = sc.nextInt();
            if (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0)){
                System.out.println(year + "为闰年");
                break;
            }else{
                System.out.println(year + "为平年");
                System.out.println("你还有"+ (2-i) +"次机会");
            }
        }
    }
}
