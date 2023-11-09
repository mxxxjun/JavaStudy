public class JavaTest3 {
    public static void main(String[] args){
        int value = 12_3456_7890;
        int money = 2_0000_0000;
        double rate = 0.05;
        value = value * 2;
        System.out.println(value);
        float k = 12F;
        System.out.println(k);
        double v = money * rate;
        int sum = (int) v;
        
        System.out.println(sum);
        System.out.println("연마다 내야하는 돈 : " + sum + "!!");
    }
}
