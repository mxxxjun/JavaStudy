package UtilizeLambda;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class predicate3 {
    static int[] arAge = {29, 30, 34, 32, 30, 31, 28, 31, 29, 30};
    public static void main(String[] args){
        System.out.println("over = " + count(a -> a > 30));//여기서 a -> a > 30이 조건식이다. 조건의 대한 true, false 의 값이 전달된다.
        System.out.println("under = " + count(a -> a < 30));
    }

    static int count(Predicate<Integer> pred){
        int num = 0;
        for(int a : arAge) if(pred.test(a)) num++;
        return num;
    }
}
