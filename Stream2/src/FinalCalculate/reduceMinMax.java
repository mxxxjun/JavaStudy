package FinalCalculate;

import java.util.Optional;

public class reduceMinMax {
    public static void main(String[] args){
        Optional<Integer> min = Data.nara.stream()
                .map(country::getPopu)
                .reduce(Integer::min);
        System.out.println(min.get());

        Optional<Integer> max = Data.nara.stream()
                .map(country::getPopu)
                .reduce(Integer::max);
        System.out.println(max.get());
    }
}
