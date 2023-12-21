package Rambda;

public class functionalInterface {
    public static void main(String[] args){
        PlusOne po = i -> i+1;//Implements 한것과 같다.
        System.out.println("result = " + po.plus(5));
    }
}

//함수형 인터페이스
interface PlusOne{
    int plus(int n);
}