public class Time {
    boolean am;
    int hour;
    int minute;
    int second;

    Time(boolean am, int hour, int minute, int second){
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    Time(boolean am, int hour, int minute){
        this(am, hour, minute, 0);
    }

    Time(int hour24, int minute){
        this(hour24 < 12, hour24 % 12, minute);
    }

    void whatTime(){
        System.out.print(am ? "오전 " : "오후 ");
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}
