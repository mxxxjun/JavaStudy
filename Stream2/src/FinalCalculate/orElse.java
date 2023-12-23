package FinalCalculate;

public class orElse {
    public static void main(String[] args){
        Human2 no = new Human2(29, "김상형", "레노보");
        useBook(no);
        Human2 no2 = new Human2(25, "노명준", null);
        useBook(no2);
    }

    static void useBook(Human2 human){
        Notebook book = human.book.orElse(new Notebook("싸구려"));
        System.out.println("내 노트북 : " + book.model);
    }
}
