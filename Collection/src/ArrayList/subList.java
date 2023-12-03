package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subList {
    public static void main(String[] args){
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        List<Integer> sub = arNum.subList(1,4);
        for(int i : sub) System.out.print(i + " ");
        System.out.println();

        arNum.set(2, 100);

        for(int i: sub) System.out.print(i + " ");
        System.out.println();

        sub.set(1, 200);
        for(int i : arNum) System.out.print(i + " ");
        System.out.println();

        sub.clear();
        for(int i : arNum) System.out.print(i + " ");
    }
}
