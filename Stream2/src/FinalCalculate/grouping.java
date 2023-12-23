package FinalCalculate;

import Stream.Cont;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class grouping {
    public static void main(String[] args){
        Map<Cont, List<country>> map = Data.nara.stream()
                .collect(Collectors.groupingBy(country::getCont));

        Set<Cont> keys = map.keySet();
        Iterator<Cont> key = keys.iterator();
        while(key.hasNext()){
            Cont cont = key.next();
            System.out.print(cont + " : ");
            List<country> n = map.get(cont);
            for(country c : n) System.out.print(c.name + " ");
            System.out.println();
        }
    }
}
