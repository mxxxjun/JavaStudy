package UtilizeLambda;

import java.util.function.Predicate;

public class methodRef {
    static int[] arAge = {29, 30, 24, 32, 30, 31, 28, 31, 29, 30};
    public static void main(String[] args){
        System.out.println("over = " + count(methodRef::isAgeOver));
        System.out.println("under = " + count(methodRef::isAgeUnder));
    }

    static boolean isAgeOver(int age){
        return age > 30;
    }

    static boolean isAgeUnder(int age){
        return age < 30;
    }

    static int count(Predicate<Integer> op){
        int num = 0;
        for(int j : arAge) if(op.test(j)) num++;
        return num;
    }
}
