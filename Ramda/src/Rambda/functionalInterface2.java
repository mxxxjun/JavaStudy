package Rambda;

public class functionalInterface2 {
    public static void main(String[] args){
        print(5, i -> i+1);
        print(5, i -> i-1);
        print(5, i -> i*2);
    }

    static void print(int i, PlusOne2 po){
        System.out.println("result = " + po.plus(i));
    }
}

interface PlusOne2{
    int plus(int i);
}