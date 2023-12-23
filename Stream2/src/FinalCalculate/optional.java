package FinalCalculate;

import java.util.Optional;

class Human2{
    int age;
    String name;
    Optional<Notebook> book;

    Human2(int age, String name, String model){
        this.age = age;
        this.name = name;
        if(model == null || model.isEmpty()) {
            book = Optional.empty();
        } else {
            book = Optional.of(new Notebook(model));
        }
    }
}

public class optional {
    public static void main(String[] args){
        Human2 kim = new Human2(25, "노명준", "애플");
        useBook(kim);

        Human2 no = new Human2(25, "노민영", null);
        useBook(no);
    }

    static void useBook(Human2 human){
        if(human.book.isPresent()){
            String model = human.book.get().model;
            System.out.println("내 노트북 : " + model);
        }
        else {
            System.out.println("내 노트북 없음");
        }
    }
}
