package Annotation;

class Car{
    String name;
    boolean gasoline;

    void run(){
        if(gasoline) {
            System.out.println("부릉부릉");
        }
        else {
            System.out.println("덜컹덜컹");
        }
    }

    @Deprecated
    void stop(){
        System.out.println("끼이익");
    }
}

public class deprecate {
    public static void main(String[] args){
        Car korando = new Car();
        korando.name = "코란도C";
        korando.gasoline = false;

        korando.run();
        korando.stop();
    }
}
