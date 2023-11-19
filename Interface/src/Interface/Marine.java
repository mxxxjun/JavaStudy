package Interface;

public class Marine implements Unit2{
    @Override
    public void move() {
        System.out.println("아장아장");
    }

    @Override
    public void attack() {
        System.out.println("두두두두두");
    }

    public void bunker(){
        System.out.println("쏙~ 숨었지롱");
    }
}
