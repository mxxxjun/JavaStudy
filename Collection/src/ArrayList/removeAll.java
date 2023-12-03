package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAll {
    public static void main(String[] args){
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> arNum2 = new ArrayList<>(Arrays.asList(2,3));

        System.out.println("차집합 => ");
        ArrayList<Integer> arNumRemove = new ArrayList<>(arNum);
        arNumRemove.removeAll(arNum2);
        for(int i : arNumRemove) System.out.println(i + " ");

        System.out.println("교집합 =>");
        ArrayList<Integer> arNumRetain = new ArrayList<>(arNum);
        arNumRetain.retainAll(arNum2);
        for(int i : arNumRetain) System.out.println(i + " ");

        System.out.println("부분집합 => ");
        if(arNum.containsAll(arNum2)) System.out.println("부분집합임");
        else System.out.println("부분집합 아님");
    }
}
