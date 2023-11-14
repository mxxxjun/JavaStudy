public class Graduate extends Student{
    String thesis;

    Graduate(int age, String name, int stnum, String major, String thesis){
        super(age, name, stnum, major);
        this.thesis = thesis;
    }

    @Override
    void intro() {
        System.out.println(thesis + " 논문을 쓰고 있는 대학원생입니다.");
    }
}
