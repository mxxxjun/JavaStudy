import java.time.LocalDateTime;

public class Human {
    int age;
    String name;
    Notebook book;

    Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    Human(int age, String name, String CPU, int memory, int storage){
        this.book = new Notebook(CPU, memory, storage);
        this.age = age;
        this.name = name;
    }

    Human(float birth, String name){
        this(0, name);
        LocalDateTime now = LocalDateTime.now();
        this.age = now.getYear() - (int)birth + 1;
    }

    void intro(){
        System.out.println("안녕, " + age + "살 " + name + "입니다.");
        System.out.print("나의 노트북 : ");
        book.printSpec();
    }
}
