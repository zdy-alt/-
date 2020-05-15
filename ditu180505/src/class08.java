import java.util.Scanner;

public class class08 {
    public static void main(String[] args) {
        System.out.println("请输入职务类别");
        Scanner sc = new Scanner(System.in);
        String Money = sc.next();
        switch (Money){
            case "A":{
                System.out.println("年终奖按 30% 提成");
                break;
            }case "B":{
                System.out.println("年终奖按 25% 提成");
                break;
            } case "C":{
                System.out.println("年终奖按 20% 提成");
                break;
            } case "D":{
                System.out.println("年终奖按 10% 提成");
                break;
            } case "E":{
                System.out.println("按5%提成");
                break;
            }
        }
    }
}
