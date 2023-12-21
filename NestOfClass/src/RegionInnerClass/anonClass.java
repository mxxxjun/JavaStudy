package RegionInnerClass;

class Human2{
    void intro(){
        System.out.println("나는 사람입니다.");
    }
}
public class anonClass {
    public static void main(String[] args){
        class Student extends Human2{
            void intro(){
                System.out.println("나는 학생입니다.");
            }
        }

        Student lee = new Student();
        lee.intro();
    }
}
