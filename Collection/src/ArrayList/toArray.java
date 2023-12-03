package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class toArray {
    public static void main(String[] args){
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(12,34,56));

        Integer[] ar = new Integer[arNum.size()];
        arNum.toArray(ar);
        for(int a : ar) System.out.print(a + " ");
    }
}
