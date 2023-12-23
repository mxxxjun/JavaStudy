package FinalCalculate;

class Notebook{
    String model;
    Notebook(String model){
        this.model = model;
    }
}

class Human{
    int age;
    String name;
    Notebook book;

    Human(int age, String name, Notebook book){
        this.age = age;
        this.name = name;
        this.book = book;
    }
}

public class nullAble {
    public static void main(String[] args){
        Human kim = new Human(25, "노명준", new Notebook("삼성"));
        useBook(kim);
    }

    static void useBook(Human human){
        System.out.println("내 노트북 : " + human.book.model);
    }
}
