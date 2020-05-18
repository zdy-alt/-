package com.cn;

import java.lang.reflect.Array;
import java.util.Scanner;
// 2.从键盘输入 20 个字符，统计大写字母出现的次数和小写字母出现的次数

public class class02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符进行判断");
        String zf = sc.next();
//        定义三种字符形式的数量:大写字母 小写字母 数字
//        单引号引的数据是char类型的。
//        双引号引的数据是String类型的。
//        单引号定义的字符为国际编码表中特定的字符，此字符对应一个码值
//        单引号单独输出时输出的是字符本身 。
//        单引号运算时转换为int型的数字(数字的值是字符对应的码值) 。
        int big = 0;
        int small = 0;
        int num = 0;
        for(int i = 0;i < zf.length();i++){
            char a = zf.charAt(i);
            if (a >= '0' && a <= '9'){
                num++;
            }else if (a >= 'a' && a <= 'z'){
                small++;
            }else if (a >='A' && a <= 'Z'){
                big++;
            }
        }
        System.out.println("大写字母数量为"+ big);
        System.out.println("小写字母数量为"+ small);
        System.out.println("数字数量为"+ num);
    }
}
