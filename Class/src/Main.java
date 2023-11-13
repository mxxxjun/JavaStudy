public class Main {
    public static void main(String[] args) {
        Car korando = new Car();
        korando.name = "코란도C";
        korando.gasoline = false;

        korando.run();
        korando.stop();
        System.out.println();

        System.out.print(korando.name + " : ");
        korando.run();

        Car equus = new Car();
        equus.name = "에꿍스";
        equus.gasoline = true;
        System.out.print(equus.name + " : ");
        equus.run();

        System.out.println('\n');
        Time now = new Time();
        now.am = true;
        now.hour = 12;
        now.minute = 34;
        now.second = 56;

        now.whatTime();

        Human kim = new Human();
        kim.age = 29;
        kim.name = "김상형";
        kim.intro();
    }
}