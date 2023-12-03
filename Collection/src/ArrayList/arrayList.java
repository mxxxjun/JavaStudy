package ArrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> arNum = new ArrayList<Integer>();
        arNum.add(1);
        arNum.add(2);
        arNum.add(3);
        arNum.add(4);
        arNum.add(5);
        for(Integer i : arNum) System.out.print(i + " ");
        arNum.add(2, 100);
        System.out.println();
        for(Integer i : arNum) System.out.print(i + " ");
    }
}
