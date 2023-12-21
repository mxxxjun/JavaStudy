package SimpleCode;

public class opObject {
    static int[] arAge = {29, 30, 34, 32, 30, 31, 28, 31, 29, 30};

    public static void main(String[] args){
        System.out.println("over = " + count2(new AgeOver()));
        System.out.println("under = " + count2(new AgeUnder()));
    }

    static int count2(AgeFilter2 op){
        int num = 0;
        for(int j : arAge) if(op.isAgeOf(j)) num++;
        return num;
    }
}

interface AgeFilter2{
    boolean isAgeOf(int age);
}

class AgeOver implements AgeFilter2{
    @Override
    public boolean isAgeOf(int age){
        return (age > 30);
    }
}

class AgeUnder implements AgeFilter2{
    @Override
    public boolean isAgeOf(int age){
        return (age < 30);
    }
}