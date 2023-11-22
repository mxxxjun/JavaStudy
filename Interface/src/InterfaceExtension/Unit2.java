package InterfaceExtension;

public interface Unit2 {
    void move();
    void attack();
    static void moveAttack(Unit2 u){
        u.move();
        u.attack();
    }
}
