package Interface;

public class Zealot implements Unit2{
    @Override
    public void move() {
        System.out.println("뒤뚱뒤뚱");
    }

    @Override
    public void attack() {
        System.out.println("우갸 우갸 챙챙");
    }
}
