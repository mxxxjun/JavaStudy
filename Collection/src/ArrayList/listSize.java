package ArrayList;

import java.util.ArrayList;

public class listSize {
    public static void main(String[] args){
        ArrayList<Integer> arNum = new ArrayList<>();
        for(int i = 0; i < 30; i++) arNum.add( (int)(Math.random() * 10) );
        for(int i : arNum) System.out.print(i + " ");
    }
}
