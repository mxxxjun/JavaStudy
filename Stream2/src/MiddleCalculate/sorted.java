package MiddleCalculate;

public class sorted {
    public static void main(String[] args){
        Data.nara.stream()
                .map(country::getName)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
    }
}
