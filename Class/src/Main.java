public class Main {
    public static void main(String[] args) {
        Car korando = new Car("코란도C", false);

        korando.run();
        korando.stop();
        System.out.println();
        korando.init("제네시스", true);
        korando.run();
        korando.stop();
        System.out.println();
        Time now1 = new Time(true, 12, 34, 56);
        now1.whatTime();

        Time now2 = new Time(true, 12, 34);
        now2.whatTime();
        Time today = new Time(18, 30);
        today.whatTime();

        Time now3 = new Time();
        now3.whatTime();
        System.out.println();
        InitTest init = new InitTest();
        System.out.println(init.field);
    }
}