package Interface;

public class DarkTempler implements Hideable{
    @Override
    public void move() {
        System.out.println("스믈 스믈");
    }

    @Override
    public void attack() {
        System.out.println("슉슉, 낫질");
    }

    @Override
    public void hide() {
        System.out.println("안보이지롱");
    }
}
