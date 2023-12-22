package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class arrayStream {
    public static void main(String[] args){
        String[] ar = {"한국", "중국", "일본"};
        Stream<String> stream = Arrays.stream(ar);
        stream.forEach(System.out::print);
    }
}
