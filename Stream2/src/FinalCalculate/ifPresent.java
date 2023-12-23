package FinalCalculate;

public class ifPresent {
    public static void main(String[] args){
        Human2 no = new Human2(25, "노명준", "apple");
        Human2 no2 = new Human2(21, "노민영", null);
        useBook(no);
        useBook(no2);
    }

    static void useBook(Human2 human){
        human.book.ifPresent(b -> System.out.println("내 노트북 : " + b.model));
    }
}
