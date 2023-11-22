package InterfaceExtension;

public class Zealot implements Unit{
    public void move(){
        System.out.println("뒤뚱뒤뚱");
    }
    public void attack(){
        System.out.println("우갸 우갸 챙챙");
    }
    public void die(){
        System.out.println("으아악");
    }
}
