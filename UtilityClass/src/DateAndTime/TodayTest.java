package DateAndTime;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class TodayTest {
    public static void main(String[] args){
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 a hh:mm:ss입니다.");
        String result = sdf.format(today.getTime());
        System.out.println(result);
    }
}
