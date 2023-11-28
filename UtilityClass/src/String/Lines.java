package String;

import java.util.stream.Stream;

public class Lines {
    public static void main(String[] args){
        String text = "apple\norange\nbanana";
        Stream<String> fruits = text.lines();
        fruits.forEach(System.out::println);
    }
}
