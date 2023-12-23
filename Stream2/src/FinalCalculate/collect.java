package FinalCalculate;

import java.util.List;
import java.util.stream.Collectors;

public class collect {
    public static void main(String[] args){
        List<String> names = Data.nara.stream()
                .map(country::getName)
                .toList();

        for(String n : names) System.out.print(n + " ");
    }
}
