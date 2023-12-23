package FinalCalculate;

import java.util.Optional;

public class minMax {
    public static void main(String[] args){
        Optional<Integer> max = Data.nara.stream()
                .map(country::getPopu)
                .max(Integer::compareTo);
        System.out.println(max);
        Optional<Integer> min = Data.nara.stream()
                .map(country::getPopu)
                .min(Integer::compareTo);
        System.out.println(min);
    }
}
