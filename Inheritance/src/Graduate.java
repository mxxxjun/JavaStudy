public class Graduate extends Student{
    String thesis;

    Graduate(int age, String name, int stnum, String major, String thesis){
        super(age, name, stnum, major);
        this.thesis = thesis;
    }

    void research(){
        System.out.println("궁시렁 궁시렁. 뭘 연구해야 떼돈을 벌까?");
    }
}
