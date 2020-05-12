import java.util.Scanner;

public class class02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        port(sc);
    }

    public static void port() {
        System.out.println("--------------欢 迎 进 入 游 戏 世 界-------------");
        System.out.println("\t\t\t******************");
        System.out.println("\t\t\t** 猜拳,开始 \t**");
        System.out.println("\t\t\t******************");
        System.out.println("出拳规则:1.剪刀 2.石头 3.布");
    }
    public static void port(Scanner sc){
        System.out.println("出拳规则:1.剪刀 2.石头 3.布");
        System.out.println("请输入对方角色名:(刘备,孙权,曹操)");
        String gameName = sc.next();
        System.out.println("请输入你的姓名:");
        String myName = sc.next();
        System.out.println(myName +"\tvs\t"+ gameName);
    }
}
