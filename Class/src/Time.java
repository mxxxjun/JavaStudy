import java.time.LocalDateTime;

public class Time {
    boolean am = true;
    int hour = 12;
    int minute = 0;
    int second = 0;

    {
        LocalDateTime now = LocalDateTime.now();
        hour = now.getHour();
        if(hour >= 12){
            hour -= 12;
            am = false;
        } else{
            am = true;
        }
        minute = now.getMinute();
        second = now.getSecond();
    }

    Time() {}

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
