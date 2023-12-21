package SimpleCode;

public class opObject2 {
    static int[] arAge = {29, 30, 34, 32, 30, 31, 28, 31, 29, 30};

    public static void main(String[] args){
        System.out.println("over = " + count(new AgeFilter3(){
            @Override
            public boolean isAgeOf(int age){
                return (age > 30);
            }
        }));
        System.out.println("under = " + count(new AgeFilter3() {
            @Override
            public boolean isAgeOf(int age) {
                return (age < 30);
            }
        }));
    }

    static int count(AgeFilter3 op){
        int num = 0;
        for(int j : arAge) if(op.isAgeOf(j)) num++;
        return num;
    }
}

interface AgeFilter3{
    boolean isAgeOf(int age);
}