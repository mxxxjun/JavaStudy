package Rambda;

public class functionalInterface3{
    public static void main(String[] args){
        FindMax max = (a,b) -> a > b? a : b;
        System.out.println("result = " + max.max(3,7));
        System.out.println("result = " + max.max(7,3));
        GetTime gt = System::currentTimeMillis;
        System.out.println("result = " + gt.systemTime());
    }
}

interface FindMax{
    int max(int a, int b);
}

interface GetTime{
    long systemTime();
}
