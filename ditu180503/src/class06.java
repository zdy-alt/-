import java.util.Scanner;

public class class06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        find(sc);
    }
    public  static  void  find(Scanner sc){
        System.out.println("某公司员工基本工资为:");
        int money = sc.nextInt();
        int e = 20000;
        System.out.println("本月销售额为"+ e +"元");
        double gongzi = money + (e * 0.03);
        System.out.println("该员工本月工资为"+ gongzi);
    }
}
