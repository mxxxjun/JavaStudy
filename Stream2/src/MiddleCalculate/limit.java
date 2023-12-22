package MiddleCalculate;

public class limit {
    public static void main(String[] args){
        Data.nara.stream()
                .limit(4)
                .forEach(System.out::println);
    }
}
