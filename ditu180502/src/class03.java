import java.util.Scanner;

public class class03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        porting(sc);
    }
    public static void porting(Scanner sc){
        System.out.println("请输入一个汉字");
        char one = sc.next().charAt(0);
        System.out.println("汉字\""+ one +"\"在Unicode表的顺序位置:"+ (int)one +"");

    }
}
