package RegionInnerClass;

interface Human6{
    void intro();
}

public class anonInterface3 {
    public static void main(String[] args){
        Human6 lee = new Human6(){
            @Override
            public void intro(){
                System.out.println("나는 학생입니다.");
            }
        };
        lee.intro();
    }
}
