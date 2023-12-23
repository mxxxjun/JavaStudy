package FinalCalculate;

import Stream.Cont;

public class allMatch {
    public static void main(String[] args){
        System.out.println(Data.nara.stream().anyMatch(c -> c.cont == Cont.ASIA));
        System.out.println(Data.nara.stream().anyMatch(c -> c.popu < 10));
        System.out.println(Data.nara.stream().anyMatch(c -> c.popu < 8));

    }
}
