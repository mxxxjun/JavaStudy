package MiddleCalculate;

public class skip {
    public static void main(String[] args){
        Data.nara.stream()
                .skip(7)
                .forEach(System.out::println);
    }
}
