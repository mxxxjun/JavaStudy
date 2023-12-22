package MiddleCalculate;


import Stream.Cont;

import java.util.Arrays;
import java.util.List;

public class Data {
    static List<country> nara = Arrays.asList(
            new country("한국", Cont.ASIA, 49, true),
            new country("미국", Cont.AMERICA, 318, true),
            new country("중국", Cont.ASIA, 1355, false),
            new country("프랑스", Cont.EUROPE, 66, true),
            new country("나이지리아", Cont.AFRICA, 177, false),
            new country("독일", Cont.EUROPE, 80, true),
            new country("헝가리", Cont.EUROPE, 9, true),
            new country("베트남", Cont.ASIA, 93, false),
            new country("칠레", Cont.AMERICA, 17, true),
            new country("캐나다", Cont.AMERICA, 34, true)
    );
}

class country {
    String name;
    Cont cont;
    int popu;
    boolean oecd;
    country(String name, Cont cont, int popu, boolean oecd){
        this.name = name;
        this.cont = cont;
        this.popu = popu;
        this.oecd = oecd;
    }

    public int getPopu() {
        return popu;
    }

    public String getName() {return name;}

    public String toString(){
        return name + " in " + cont + " : " + popu + (oecd ? "(0)" : "");
    }
}

