package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class shuffle {
    public static void main(String[] args){
        ArrayList<String> arName = new ArrayList<>();
        arName.add("장보고");
        arName.add("김유신");
        arName.add("강감찬");
        arName.add("을지문덕");

        Collections.shuffle(arName);

        for(String name : arName) System.out.println(name);
    }
}
