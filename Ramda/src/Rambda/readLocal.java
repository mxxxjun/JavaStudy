package Rambda;

public class readLocal {
    public static void main(String[] args){
        final int value = 123;
        PlusOne3 po = i -> {
            System.out.println(value);
            return i+1;
        };
        System.out.println(po.plus(value));
    }
}

@FunctionalInterface
interface PlusOne3{
    int plus(int n);
}