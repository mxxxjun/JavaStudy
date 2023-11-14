public class Truck extends Car{
    int ton;

    Truck(String name, int ton){
        super(name,false);
        this.ton = ton;
    }

    void load(){
        System.out.println("짐을 싣는다.");
    }
}
