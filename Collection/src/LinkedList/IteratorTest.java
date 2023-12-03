package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args){
        List<String> arName = new LinkedList<>();
        arName.add("전두환");
        arName.add("김영삼");
        arName.add("김대중");
        arName.add(1, "노태우");

        Iterator<String> it = arName.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
