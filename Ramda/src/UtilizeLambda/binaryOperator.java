package UtilizeLambda;

import java.util.function.BinaryOperator;

public class binaryOperator {
    public static void main(String[] args){
        BinaryOperator<Integer> add = (a, b) -> a+b;
        System.out.println("result = " + add.apply(3,7));
    }
}
