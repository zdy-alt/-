import java.util.Scanner;

public class class05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        find(sc);
    }
    public static void find(Scanner sc){
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        System.out.println("请输入第三个数");
        int c = sc.nextInt();
        if((a + b > c && a + c > b && b + c > a)&&(a - b < c && a - c < b && b - c < a)){
            System.out.println("能组成三角形");
        }else{
            System.out.println("不能组成三角形");
        }
    }
}
