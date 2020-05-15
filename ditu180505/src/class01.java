import java.util.Scanner;

public class class01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("账号:");
        String textName = sc.next();
        System.out.println("密码:");
        int passWord = sc.nextInt();
        if (textName.equals("0123") && (passWord == 1234)){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
    }
}
