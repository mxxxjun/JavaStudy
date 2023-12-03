package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class addAll {
    public static void main(String[] args){
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> arNum2 = new ArrayList<>(Arrays.asList(4,5,6));

        arNum.addAll(arNum2);
        for(int i : arNum) System.out.print(i + " ");
    }
}
