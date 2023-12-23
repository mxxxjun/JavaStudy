package FinalCalculate;

import java.util.Optional;

public class reduce2 {
    public static void main(String[] args){
        Optional<Integer> total = Data.nara.stream()
                .map(country::getPopu)
                .reduce(Integer::sum);

        System.out.println(total);
    }
}
