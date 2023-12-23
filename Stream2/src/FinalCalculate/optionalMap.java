package FinalCalculate;

public class optionalMap {
    public static void main(String[] args){
        Human2 kim = new Human2(24, "김상형", "레노버");
        useBook(kim);
    }
    static void useBook(Human2 human){
        String model = human.book.map(b -> b.model).orElse("이름 없음");
        System.out.println(model);
    }
}
