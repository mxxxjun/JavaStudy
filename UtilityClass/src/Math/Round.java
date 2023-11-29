package Math;

public class Round {
    public static void main(String[] args){
        double value = 123.456789;

        double value1000 = value * 1000;
        System.out.println(value1000);
        double valueRound = Math.round(value1000);
        System.out.println(valueRound);
        double value3 = valueRound / 1000.0;
        System.out.println(value3);
    }
}
