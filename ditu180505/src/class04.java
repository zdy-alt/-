import java.util.Scanner;

public class class04 {
    public static void main(String[] args) {
        System.out.println("1.夏利,2.富豪,3.神龙");
        Scanner sc = new Scanner(System.in);
        System.out.println("千米数");
        double km = sc.nextDouble();
        System.out.println("车型");
        int car = sc.nextInt();
        String carName = "";
        double price = 0;
        if( car ==1){
            carName = "夏利";
            price = 3 + km*3;
        }else if(car ==2){
            carName = "富豪";
            price = 4 + km*2.8;
        }else if(car ==3){
            carName = "神龙";
            price = 5 + km*2.6;
        }else{
            System.out.println("请选择车型");
        }
        System.out.println("您选择的是"+ carName +",价格为:"+ price);
    }
}
