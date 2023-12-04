package GenericHierarchy;

class Human{
    void intro(){
        System.out.println("나 사람");
    }
}

class Student extends Human{
    void intro(){
        System.out.println("나 학생");
    }
}
class Box<T extends Human>{
    T value;
    Box(T value){
        this.value = value;
    }
    T get(){
        return value;
    }
    void set(T value){
        this.value = value;
    }
    void intro(){
        value.intro();
    }
}

public class Bound {
    public static void main(String[] args){
        Human h = new Human();
        Box<Human> human = new Box<>(h);
        human.intro();

        Student s = new Student();
        Box<Student> student = new Box<>(s);
        student.intro();
    }
}
