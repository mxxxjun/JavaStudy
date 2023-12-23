package FinalCalculate;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class oecdGroup {
    public static void main(String[] args){
        Map<Boolean, List<country>> map = Data.nara.stream()
                .collect(Collectors.groupingBy(country::getOecd));

        Set<Boolean> keys = map.keySet();
        for (Boolean oecd : keys) {
            System.out.print(oecd + " : ");
            List<country> n = map.get(oecd);
            for (country c : n) System.out.print(c.name + " ");
            System.out.println();
        }
    }
}
