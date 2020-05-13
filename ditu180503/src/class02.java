import java.util.Scanner;

public class class02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        porting(sc);
    }
    public static  void porting(Scanner sc){
        System.out.println("请输入长方形的长");
        int height = sc.nextInt();
        System.out.println("请输入长方形的宽");
        int weight = sc.nextInt();
        double area = height * weight;
        System.out.println("长方形的面积为:" + area);

    }
}
