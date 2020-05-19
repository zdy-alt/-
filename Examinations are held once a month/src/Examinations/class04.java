package Examinations;

import java.util.Scanner;

//4.	循环输入有5个元素的整型数组，并用冒泡排序对数组从大到小排序。
public class class04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];//定义数组数量为5
        for (int i = 0; i <array.length ;i++ ) {
            System.out.println("请输入第"+(i+1)+"个整数");
            if (sc.hasNext()){//hasNext 判断是否有输入，有输入项  hasNext()为true，没有输入项 hasNext()为false。
                int num = sc.nextInt();
                array[i] = num;
            }else{
                System.out.println("请输入一个整数");
            }
        }
        for (int i = 0; i <array.length ; i++) {//循环遍历初始数组
            System.out.print(array[i]+" ");
        }
        System.out.println();//分隔
//        冒泡排序   五个数之间每一个数字依次比较次数为 4 次 五个数字有 四种比较
        for (int i = 0; i <array.length-1 ; i++) { //四种比较
            for (int j = 0; j <array.length-1 ; j++) { //比较次数为 4 次
                if (array[j]<array[j+1]){
                    int temp =array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {//再次遍历排列后的数组
            System.out.print(array[i]+" ");
        }
    }
}
