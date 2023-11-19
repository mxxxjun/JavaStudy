package Interface;

public class Main {
    public static void main(String[] args){
        Unit2[] arUnit1 = {
                new Marine(),
                new Zealot(),
                new Mutal()
        };

        for(Unit2 u : arUnit1){
            u.move();
            u.attack();
        }

        System.out.println();

        Unit2[] arUnit2 = {
                new Marine(),
                new Zealot(),
                new Mutal(),
                new SuperMan(),
                new Firebat()
        };

        for(Unit2 u : arUnit2){
            u.move();
            u.attack();
        }
    }
}
