package Generic;

import java.util.ArrayList;

public class rawArrayList {
    public static void main(String[] args){
        ArrayList arNum = new ArrayList();
        arNum.add(1);
        arNum.add("문자열");
        int value = (int)arNum.get(0);
        String temp = (String)arNum.get(1);
        System.out.println(value);
        System.out.println(temp);
    }
}
