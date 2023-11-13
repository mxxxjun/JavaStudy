public class Car {
    String name;
    boolean gasoline;

    Car(String aName, boolean aGasoline){
        name = aName;
        gasoline = aGasoline;
    }

    void init(String name, boolean gasoline){
        this.name = name;
        this.gasoline = gasoline;
    }

    void run(){
        if(gasoline){
            System.out.println("부릉부릉");
        } else{
            System.out.println("덜컹덜컹");
        }
    }

    void stop(){
        System.out.println("끼이익");
    }
}
