package Generic;

import java.util.ArrayList;

public class JavaTest4 {
    static <T> void dumpArray(ArrayList<T> ar){
        for(T a : ar) System.out.println(a);
    }

    public static void main(String[] args){
        ArrayList<String> day = new ArrayList<>();
        day.add("일요일");
        day.add("월요일");
        dumpArray(day);

        ArrayList<Integer> score = new ArrayList<>();
        score.add(98);
        score.add(72);
        dumpArray(score);
    }
}
