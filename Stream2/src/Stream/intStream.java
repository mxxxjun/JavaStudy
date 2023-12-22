package Stream;

import java.util.stream.Stream;

public class intStream {
    public static void main(String[] args){
        Stream<Integer> stream = Stream.of(3,1,4,1,5);
        stream.forEach(System.out::print);
    }
}
