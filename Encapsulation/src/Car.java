public class Car {
    String name;
    boolean gasoline;
    static int carNum;

    Car(String aName, boolean aGasoline){
        name = aName;
        gasoline = aGasoline;
        carNum++;
    }

    static void resetNum(){
        carNum=0;
    }

    static void printNum(){
        System.out.println("현재 출고 대수 : " + carNum);
    }

    void run(){
        if(gasoline) System.out.println("부릉부릉");
        else System.out.println("덜컹덜컹");
    }
}
