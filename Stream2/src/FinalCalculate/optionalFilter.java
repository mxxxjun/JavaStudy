package FinalCalculate;

public class optionalFilter {
    public static void main(String[] args){
        Human2 kim = new Human2(25, "김상형", "삼성");
        useBook(kim);
    }

    static void useBook(Human2 human){
        human.book.filter(b -> b.model.indexOf("삼성") != -1)
                .ifPresent(b -> System.out.println("삼성 노트북"));
    }
}
