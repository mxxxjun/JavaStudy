package RegionInnerClass;

interface Human5{
    void intro();
}

public class anonInterface2 {
    public static void main(String[] args){
        class Anonymous implements Human5{
            @Override
            public void intro(){
                System.out.println("나는 학생입니다.");
            }
        }

        Anonymous lee = new Anonymous();
        lee.intro();
    }
}
