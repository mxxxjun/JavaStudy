package Stream;

import java.util.Comparator;

public class countryStream {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        int total = Data.nara.stream()
                .filter(c -> c.oecd)
                .sorted(Comparator.comparing(country::getPopu).reversed())
                .limit(3)
                .map(country::getPopu)
                .reduce(0, Integer::sum);
        System.out.println("OECD 상위 3개국의 인구수 = " + total);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0 + "초");
    }
}
