package Generic;

import java.util.ArrayList;

public class genArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arNum = new ArrayList<>();
        arNum.add(1);
        //arNum.add("문자열");
        int value = arNum.get(0);
        System.out.println(value);
    }
}
