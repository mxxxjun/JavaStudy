package ArrayList;

import java.util.Arrays;
import java.util.List;

public class asList {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(11, 22, 33, 44 ,55);
        for(int i : list) System.out.print(i + " ");
    }
}
