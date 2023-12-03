package LinkedList;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args){
        LinkedList<String> arName = new LinkedList<>();
        arName.add("전두환");
        arName.add("김영삼");
        arName.add("김대중");
        arName.add(1, "노태우");

        for(String s : arName) System.out.println(s);
    }
}
