package FinalCalculate;

import java.util.Optional;
import java.util.stream.Collectors;

public class collectMinMax {
    public static void main(String[] args){
        long num = Data.nara.stream()
                .collect(Collectors.counting());
        System.out.println(num);
        Optional<Integer> max = Data.nara.stream()
                .map(country::getPopu)
                .collect(Collectors.maxBy(Integer::compareTo));
        System.out.println(max.get());
        Optional<Integer> min = Data.nara.stream()
                .map(country::getPopu)
                .collect(Collectors.minBy(Integer::compareTo));
        System.out.println(min.get());

    }
}
