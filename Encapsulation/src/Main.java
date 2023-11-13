public class Main {
    public static void main(String[] args) {
        Time now = new Time(12, 34, 56);
        now.whatTime();
        //now.hour = 34;
        now.setHour(34);
        now.setSecond(-25);
        now.whatTime();
        now.setHour(10);
        now.setMinute(45);
        now.whatTime();

        System.out.println();

        Range range = new Range(2, 6);
        range.outRange();
        range.setFrom(8);
        range.outRange();

        System.out.println();
        Car korando = new Car("코란도C", false);
        System.out.println(korando.name + " : " + Car.carNum);

        Car equus = new Car("에꿍스", true);
        System.out.println(equus.name + " : " + Car.carNum);

        Car pride = new Car("프라이드", true);
        System.out.println(pride.name + " : " + Car.carNum);

        Bus bus1 = new Bus();
        bus1.printFare(1,5);

        Bus bus2 = new Bus();
        bus2.printFare(2,4);

        Car.printNum();
        Car pride2 = new Car("프라이드", true);
        Car korando2 = new Car("코란도C", false);
        Car.printNum();
        Car.resetNum();
        Car equus2 = new Car("에꿍스", true);
        Car.printNum();

        System.out.println();
        Hello.morning();
        Hello.lunch();
        Hello.evening();

    }
}