import java.util.Scanner;

public class class03 {
    //根据ASCII码来定义范围
//    0～31及127(共33个)是控制字符或通信专用字符（其余为可显示字符），
//    如控制符：LF（换行）、CR（回车）、FF（换页）、DEL（删除）、BS（退格)、BEL（响铃）等；
//    通信专用字符：SOH（文头）、EOT（文尾）、ACK（确认）等；
//    ASCII值为8、9、10 和13 分别转换为退格、制表、换行和回车字符。它们并没有特定的图形显示，但会依不同的应用程序，而对文本显示有不同的影响 。
//    32～126(共95个)是字符(32是空格），其中48～57为0到9十个阿拉伯数字。
//    65～90为26个大写英文字母，97～122号为26个小写英文字母，其余为一些标点符号、运算符号等。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char zf = sc.next().charAt(0);
        if (zf >= 48 && zf <= 57){
            System.out.println("您输入的是一个数字");
        }else if(zf >= 97 && zf <= 122){
            System.out.println("您输入的是小写字母");
        }else if(zf >= 65 && zf <= 90){
            System.out.println("您输入的是大写字母");
        }else{
            System.out.println("你输入的是其他字符");
        }
    }
}
