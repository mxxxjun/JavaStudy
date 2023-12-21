package SimpleCode;

import java.util.function.Predicate;

public class libInterface {
    static int[] arAge = {29, 30, 34, 32, 30, 31, 28, 31, 29, 30};

    public static void main(String[] args){
        System.out.println("over = " + count(a -> a > 30));
        System.out.println("under = " + count(a -> a < 30));

        System.out.println("29세 이상 = " + count(a -> a >= 29));
        System.out.println("30세가 아닌 사람 = " + count(a -> a != 30));
        System.out.println("짝수 나이 = " + count(a -> a % 2 == 0));
        System.out.println("28 ~ 30 범위 = " + count(a -> a >= 28 && a <= 30));
    }

    static int count(Predicate<Integer> op){
        int num = 0;
        for(int i : arAge) if(op.test(i)) num++;
        return num;
    }
}
