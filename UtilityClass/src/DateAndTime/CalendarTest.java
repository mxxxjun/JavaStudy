package DateAndTime;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] arg){
        GregorianCalendar today = new GregorianCalendar();
        System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초",
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH) + 1,
                today.get(Calendar.DATE),
                today.get(Calendar.AM_PM) == Calendar.AM ? "오전" : "오후",
                today.get(Calendar.HOUR),
                today.get(Calendar.MINUTE),
                today.get(Calendar.SECOND));
    }
}
