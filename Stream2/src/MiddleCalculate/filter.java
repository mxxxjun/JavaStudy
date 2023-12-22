package MiddleCalculate;

public class filter {
    public static void main(String[] args){
        Data.nara.stream()
                .filter(c -> c.oecd)
                .forEach(System.out::println);
    }
}
