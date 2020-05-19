package Examinations;

import java.util.Scanner;

//5.	使用二维数组存储3位客户信息，客户信息有：会员号，年龄，积分。存储完成后打印刚才输入的客户信息（以表格形式）
public class class05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[3][3]; //客户的二维数组
        System.out.println("请输入客户信息:会员号，年龄，积分");
//        初始化数组
        for (int i = 0; i < 3; i++) {
            System.out.print("第"+(i+1)+"位客户");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.next(); //每位客户信息占一行
            }
        }
        System.out.println("会员号\t年龄\t积分");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
