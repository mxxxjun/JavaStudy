public class Human2 extends Notebook{
    int age;
    String name;

    Human2(int age, String name, String CPU, int memory, int storage){
        super(CPU, memory, storage);
        this.age = age;
        this.name = name;
    }

    void intro(){
        System.out.println("안녕, " + age + "살 " + name + "입니다.");
        System.out.println("나의 노트북 : ");
        printSpec();
    }
}
