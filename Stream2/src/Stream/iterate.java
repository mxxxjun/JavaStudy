package Stream;
import java.util.stream.Stream;
public class iterate {
    public static void main(String[] args){
        Stream.iterate(1, a -> a+1)
                .limit(5)
                .forEach(System.out::println);
    }
}
