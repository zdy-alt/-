import java.util.Scanner;

public class class06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入笔试成绩");
        int one = sc.nextInt();
        System.out.println("请输入机试成绩");
        int two = sc.nextInt();
        if (one >= 60 && two >= 60){
            System.out.println("通过结业考试");
        }else {
            System.out.println("未通过结业考试,需要补考");
        }

    }
}
