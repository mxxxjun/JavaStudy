package GenericHierarchy;

class Human3{
    void intro(){
        System.out.println("나 사람");
    }
}
class Student3 extends Human3{
    void intro(){
        System.out.println("나 학생");
    }
}
class Box3<T>{
    T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Box3(T value) {
        this.value = value;
    }
}
public class WildCard {
    static void printMan(Box3<? extends Human3> box){
        box.getValue().intro();
    }

    public static void main(String[] args){
        Human3 h = new Human3();
        Box3<Human3> bh = new Box3<Human3>(h);
        printMan(bh);

        Student3 s = new Student3();
        Box3<Student3> bs = new Box3<>(s);
        printMan(bs);
    }
}
