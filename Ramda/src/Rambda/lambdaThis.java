package Rambda;

public class lambdaThis {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.method();
    }
}

class Outer{
    void method(){
        class PlusOneImpl implements PlusOne{
            @Override
            public int plus(int i){
                System.out.println(this);
                return i+1;
            }
        }
        PlusOne po = new PlusOneImpl();
        System.out.println("result = " + po.plus(5));

        PlusOne po2 = i -> {
            System.out.println(this);
            return i+1;
        };
        System.out.println("result = " + po2.plus(5));
    }
}