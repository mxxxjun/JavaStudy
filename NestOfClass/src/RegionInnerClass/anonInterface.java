package RegionInnerClass;

interface Human4{
    void intro();
}

class Anonymous implements Human4{
    @Override
    public void intro(){//interface를 구현할 때, public으로 구현해야 함.
        System.out.println("나는 학생입니다.");
    }
}

public class anonInterface {
    public static void main(String[] args){
        Anonymous lee = new Anonymous();
        lee.intro();
    }
}
