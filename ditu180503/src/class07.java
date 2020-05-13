public class class07 {
    public static void main(String[] args) {
        double chinese = 98;
        double math  = 76;
        double english = 88;
        System.out.println("总分:"+(chinese + math + english));
        double averAge = (chinese + math + english) / 3;
//        System.out.println("平均分"+String.format("%.5f",averAge));
        System.out.println("平均分"+averAge);
    }
}
