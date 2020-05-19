package com.cn;

public class class04 {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <= 4-i; j++){
                System.out.print(" ");
            }
            for (int k = 1;k <= i*2-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >=i*2-1 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
