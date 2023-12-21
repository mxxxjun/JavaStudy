package SimpleCode;

public class lambda {
    static int[] arAge = {29, 30, 34, 32, 30, 31, 28, 31, 29, 30};

    public static void main(String[] args){
        System.out.println("over = " + count(a -> a>30));
        System.out.println("under = " + count(a -> a<30));
    }

    static int count(AgeFilter op){
        int num=0;
        for(int j : arAge) if(op.isAgeOf(j)) num++;
        return num;
    }
}

interface AgeFilter{
    boolean isAgeOf(int age);
}