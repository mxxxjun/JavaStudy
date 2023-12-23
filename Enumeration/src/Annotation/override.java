package Annotation;

class Human{
    void move(int x, int y){
        System.out.println("사람 : 뚜벅뚜벅");
    }
    int think(String what){
        return 0;
    }
}

class Student extends Human{
    @Override
    void move(int x, int y){
        System.out.println("학생 : 아장아장");
    }

    @Override
    int think(String what){
        return 1;
    }
}

public class override {
    public static void main(String[] args){
        Student kim = new Student();
        kim.move(0,0);
    }
}
