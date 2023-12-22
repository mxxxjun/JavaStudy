package MiddleCalculate;

import Stream.Cont;

import java.util.Arrays;
import java.util.List;

public class comparable {
    public static void main(String[] args){
        Data2.nara.stream()
                .sorted()
                .forEach(System.out::println);
    }
}

class Data2{
    static List<country2> nara = Arrays.asList(
            new country2("한국", Cont.ASIA, 49, true),
            new country2("미국", Cont.AMERICA, 318, true),
            new country2("중국", Cont.ASIA, 1355, false),
            new country2("프랑스", Cont.EUROPE, 66, true),
            new country2("나이지리아", Cont.AFRICA, 177, false),
            new country2("독일", Cont.EUROPE, 80, true),
            new country2("헝가리", Cont.EUROPE, 9, true),
            new country2("베트남", Cont.ASIA, 93, false),
            new country2("칠레", Cont.AMERICA, 17, true),
            new country2("캐나다", Cont.AMERICA, 34, true)
    );
}

class country2 implements Comparable<country2>{
    String name;
    Cont cont;
    int popu;
    boolean oecd;
    country2(String name, Cont cont, int popu, boolean oecd){
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

    @Override
    public int compareTo(country2 o) {
        return popu - o.popu;
    }
}
