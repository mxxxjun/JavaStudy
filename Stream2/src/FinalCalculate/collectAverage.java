package FinalCalculate;

import java.util.stream.Collectors;

public class collectAverage {
    public static void main(String[] args){
        int sum = Data.nara.stream()
                .collect(Collectors.summingInt(country::getPopu));
        System.out.println(sum);
        double avg = Data.nara.stream()
                .collect(Collectors.averagingInt(country::getPopu));
        System.out.println(avg);
    }
}
