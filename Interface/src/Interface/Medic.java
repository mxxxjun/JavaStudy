package Interface;

public class Medic implements Healing{
    @Override
    public void move() {
        System.out.println("쫄래 쫄래");
    }

    @Override
    public void attack() {
        System.out.println("치지지직");
    }

    @Override
    public void heal() {
        System.out.println("마린씨 일루와");
    }
}
