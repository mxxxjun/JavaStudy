package FinalCalculate;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class summing {
    public static void main(String[] args){
        IntSummaryStatistics summary = Data.nara.stream()
                .collect(Collectors.summarizingInt(country::getPopu));
        System.out.println(summary);
    }
}
