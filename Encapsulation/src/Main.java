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
    }
}