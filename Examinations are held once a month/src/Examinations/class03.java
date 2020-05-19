package Examinations;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//4.	循环输入有5个元素的整型数组，并用冒泡排序对数组从大到小排序。
public class class03 {
    public static void main(String[] args) {
        int[] array = new int[5];//定义一个个数为5的数组
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length;) {
            System.out.println("请输入第"+ (i+1) +"个数");
            if (sc.hasNext()){//hasNext 判断是否有输入，有输入项  hasNext()为true，没有输入项 hasNext()为false。
                int num = sc.nextInt();
                array[i] = num;
                i++;
            }else {
                System.out.println("请输入一个正整数");
            }
        }
        System.out.println(Arrays.toString(array));//输出打印整段数组
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (max < array[i]){
                max = array[i];
            }
            if (min> array[i]){
                min = array[i];
            }
        }
        System.out.println("最大值为:"+ max +"最小值为:"+min);
    }
}
