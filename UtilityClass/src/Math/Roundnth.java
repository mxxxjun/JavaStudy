package Math;

public class Roundnth {
    public static void main(String[] args){
        System.out.println(roundNtn(123.456789, 0));
        System.out.println(roundNtn(123.456789, 1));
        System.out.println(roundNtn(123.456789, 2));
        System.out.println(roundNtn(123.456789, 3));
        System.out.println(roundNtn(123.456789, 4));
    }

    static double roundNtn(double value, int n){
        double multi = Math.pow(10, n);
        return Math.round(value * multi) / multi;
    }
}
