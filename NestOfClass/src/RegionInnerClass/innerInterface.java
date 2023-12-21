package RegionInnerClass;

interface Workable{
    void work(String what, int time);
}

class Staff{
    void doWork(Workable w, String what, int time){
        w.work(what, time);
    }
}

public class innerInterface {
    public static void main(String[] args){
        Staff kim = new Staff();
        Workable kimwork = new Workable() {
            @Override
            public void work(String what, int time) {
                System.out.println(what + " 작업을 " + time + "시간동안 열심히 하기");
            }
        };
        kim.doWork(kimwork, "보고서 작성", 2);

        Staff lee = new Staff();
        Workable leework = new Workable() {
            @Override
            public void work(String what, int time) {
                System.out.println(time + "시간동안 빈둥대며 " + what);
            }
        };

        lee.doWork(leework, "커피 타기", 3);
    }
}
