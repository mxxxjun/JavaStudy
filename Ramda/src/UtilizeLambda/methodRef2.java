package UtilizeLambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class methodRef2 {
    public static void main(String[] args){
        Function<String, String> upper = String::toUpperCase;
        System.out.println(upper.apply("korea"));

        Consumer<String> print = System.out::println;
        print.accept("korea");
    }
}
