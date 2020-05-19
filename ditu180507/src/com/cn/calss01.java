package com.cn;

public class calss01 {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) { //行
            for (int j = 1; j <=i; j++) {//列
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
