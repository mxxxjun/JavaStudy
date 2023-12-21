package UtilizeLambda;

import java.util.function.Function;

public class compose {
    public static void main(String[] args){
        Function<String, Integer> engToNum = e -> {
            if(e.equals("one")) return 1;
            return 0;
        };

        Function<Integer, String> numToHan = n -> {
            if(n == 1) return "하나";
            return "영";
        };

        String eng = "one";
        int num = engToNum.apply(eng);
        String han = numToHan.apply(num);
        System.out.println(han);

        Function<String, String> engToHan = engToNum.andThen(numToHan);
        System.out.println(engToHan.apply("one"));

        Function<String, String> engToHan2 = numToHan.compose(engToNum);
        System.out.println(engToHan2.apply("one"));
    }
}
