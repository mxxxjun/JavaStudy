package FinalCalculate;

import java.util.stream.Collectors;

public class collector {
    public static void main(String[] args){
        String names = Data.nara.stream()
                .map(country::getName)
                .collect(Collectors.joining(", "));
        System.out.println(names);
    }
}
