package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subList2 {
    public static void main(String[] args){
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        List<Integer> sub = arNum.subList(1,4);
        arNum.remove(2);
        for(int i : sub) System.out.print(i + " ");
    }
}
