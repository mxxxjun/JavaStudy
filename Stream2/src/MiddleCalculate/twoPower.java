package MiddleCalculate;

import java.util.stream.Stream;

public class twoPower {
    public static void main(String[] args){
        Stream.iterate(2, a -> a*2)
                .limit(10)
                .forEach(n -> System.out.print(n + " "));
    }
}
