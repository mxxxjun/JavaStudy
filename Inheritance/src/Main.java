public class Main {
    public static void main(String[] args) {
        Human kim = new Human(29, "김상형");
        kim.intro();
        Student lee = new Student(42, "이승우", 9312345, "경영");
        lee.intro();
        lee.study();
        System.out.println();
        Truck porter = new Truck("포터", 1);
        porter.run();
        porter.load();
        System.out.println();
        Graduate park = new Graduate(35, "박대희", 95001122, "전산", "웹 보안에 대한 연구");
        park.intro();
        park.study();
        park.research();
        System.out.println();

        Student kim1 = new Student(39, "노정란", 9908123, "건축");
        kim1.intro();
        Student bae = new Student(1989.10f, "백지영", 1125034, "간호");
        bae.intro();

        System.out.println();

        Student lee1 = new Student(35, "이율곡", 150629, "주자학");
        lee.study();

        Soldier kang = new Soldier(45, "강감찬", 12345);
        kang.fight();

        Thief hong = new Thief(15, "홍길동", "부자집", 2);
        hong.steal();
    }
}