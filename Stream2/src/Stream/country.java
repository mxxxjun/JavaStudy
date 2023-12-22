package Stream;

import java.util.*;

public class country {
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

    public String toString(){
        return name + " in " + cont + " : " + popu + (oecd ? "(0)" : "");
    }
}

class Data{
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

class JavaTest{
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        List<country> oecd = new ArrayList<>();
        for(country c : Data.nara){
            if(c.oecd) oecd.add(c);
        }
        Collections.sort(oecd, (o1, o2) -> o2.popu - o1.popu);
        int total = 0;
        for(int i = 0; i < 3; i++) total += oecd.get(i).popu;
        System.out.println("OECD 상위 3개국의 인구수 = " + total);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0 + "초");
    }
}