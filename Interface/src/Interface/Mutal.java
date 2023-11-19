package Interface;

public class Mutal implements Unit2{
    @Override
    public void move() {
        System.out.println("퍼득 퍼득");
    }

    @Override
    public void attack() {
        System.out.println("삼지창 휙휙");
    }
}
