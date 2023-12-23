package FinalCalculate;

import java.util.stream.IntStream;

public class rangeClosed {
    public static void main(String[] args){
        int total = IntStream.rangeClosed(1, 100).sum();
        System.out.println(total);
    }
}
