package kr.soen.choi;

public class Car {
    String name;
    boolean gasoline;

    public Car(String name, boolean gasoline){
        this.name = name;
        this.gasoline = gasoline;
    }

    public void run(){
        if(gasoline) System.out.println("부릉부릉");
        else System.out.println("덜컹덜컹");
    }

    public void stop(){
        System.out.println("끼이익");
    }
}
