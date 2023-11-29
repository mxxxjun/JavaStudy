package DateAndTime;

import java.util.GregorianCalendar;

public class Birth {
    public static void main(String[] args){
        GregorianCalendar birth = new GregorianCalendar(1999,12,12);
        GregorianCalendar today = new GregorianCalendar();
        long diff = today.getTimeInMillis() - birth.getTimeInMillis();
        long days = diff / (24 * 60 * 60 * 1000);
        System.out.println("오늘은 태어난지 " + days + "일째");
    }
}
