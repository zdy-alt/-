package Examinations;

import java.util.Scanner;

public class class06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //完成一个3*3的九方格小游戏 棋子为   x    o  谁先成为一条线谁就赢得游戏
        int[][] arr = new int[3][3];//定义九方格数组
        int x ;     //棋子x 的数量
        int o ;     //棋子o 的数量
        int no = -1 ;   //no 为谁也无法获胜平局   1:x赢 0:O 赢
//        输入的数字 偶数 就x++  奇数 就o++
//      录入九方格数组
        System.out.println("请输入正整数");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        遍历数组
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
//        检查行
        for (int i = 0; i <3 && no == -1 ; i++) {
            x = o = 0;
            for (int j = 0; j <3 ; j++) {
                if (arr[i][j] %2 == 0){
                    x++;
                }else {
                    o++;
                }
            }
            if ( o == 3){
                no = 0;
                System.out.println("o获胜");
                break;
            }else if (x == 3){
                no = 1;
                System.out.println("x获胜");
                break;
            }

        }
//       检查列
        if (no == -1){
            for (int j = 0; j < 3 ; j++) {
                x=o=0;
                for (int i = 0; i < 3; i++) {
                    if (arr[i][j] %2 == 0){
                        x++;
                    }else{
                        o++;
                    }
                }
                if ( o == 3){
                    no = 0;
                    System.out.println("o获胜");
                    break;
                }else if (x == 3){
                    no = 1;
                    System.out.println("x获胜");
                    break;
                }
                System.out.println("平局");
                break;
            }

        }

    }
}
