package InterfaceExtension;

public interface Unit {
    void move();
    void attack();
    default void die(){
        System.out.println("꽥꼬닥");
    }
}
