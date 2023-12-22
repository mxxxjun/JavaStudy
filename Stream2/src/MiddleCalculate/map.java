package MiddleCalculate;

public class map {
    public static void main(String[] args){
        Data.nara.stream()
                .map(country::getName)
                .forEach(c -> System.out.print(c + " "));
    }
}
