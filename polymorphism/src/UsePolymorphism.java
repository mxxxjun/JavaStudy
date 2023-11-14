public class UsePolymorphism {
    public static void main(String args[]){
        Human[] arHuman = {
                new Human(29, "김상형"),
                new Student(42, "이승우", 9312345, "경영"),
                new Soldier(45, "강감찬", 12345),
                new Thief(15, "홍길동", "부자집", 2),
                new Graduate(35, "박대희", 95001122, "전산", "웹 보안에 대한 연구"),
        };

        dumpGroup(arHuman);

        System.out.println();

        DeliveryMan kang = new DeliveryMan();
        kang.delivery(new Bike(), "짜장면");
        kang.delivery(new AutoBike(), "피자");
        kang.delivery(new SkyKongKong(), "햄버거");
    }

    static void dumpGroup(Human[] group){
        for(Human h : group) h.intro();
    }
}
