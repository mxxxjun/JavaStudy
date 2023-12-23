package FinalCalculate;

import java.util.stream.Collectors;

public class reduceSum {
    public static void main(String[] args){
        int sum = Data.nara.stream()
                .collect(Collectors.reducing(0, country::getPopu, Integer::sum));
        System.out.println(sum);
    }
}
