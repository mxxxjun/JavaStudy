package System;

public class PrintIndex {
    public static void main(String[] args){
        int i = 123;
        double d= 3.14;
        String str = "문자열";

        System.out.printf("i = %3$d, d = %2$f, str = %1$s", str, d, i);
    }
}
