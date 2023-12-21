package RegionInnerClass;

class Human3{
    void intro(){
        System.out.println("나는 사람입니다.");
    }
}

public class anonClass2 {
    public static void main(String[] args){
        Human3 lee = new Human3(){
            void intro(){
                System.out.println("나는 학생입니다.");
            }
        };
        lee.intro();
    }
}
