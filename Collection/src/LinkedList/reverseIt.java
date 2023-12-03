package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class reverseIt {
    public static void main(String[] args){
        List<String> arName = new ArrayList<>();
        arName.add("전두환");
        arName.add("김영삼");
        arName.add("김대중");
        arName.add(1, "노태우");

        ListIterator<String> it = arName.listIterator(arName.size());
        while(it.hasPrevious()) System.out.println(it.previous());
    }
}
