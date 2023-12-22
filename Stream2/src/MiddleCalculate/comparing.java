package MiddleCalculate;

import java.util.Comparator;

public class comparing {
    public static void main(String[] args){
        Data.nara.stream()
                .sorted(Comparator.comparing(country::getPopu).reversed())
                .forEach(System.out::println);
    }
}
