package MiddleCalculate;

public class limitSkip {
    public static void main(String[] args){
        Data.nara.stream()
                .skip(2)
                .limit(5)
                .forEach(System.out::println);
        System.out.println("===========================");
        Data.nara.stream()
                .limit(5)
                .skip(2)
                .forEach(System.out::println);
    }
}
