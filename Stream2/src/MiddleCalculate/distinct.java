package MiddleCalculate;

public class distinct {
    public static void main(String[] args){
        Data.nara.stream()
                .map(c -> c.cont)
                .distinct()
                .forEach(System.out::println);
    }
}
