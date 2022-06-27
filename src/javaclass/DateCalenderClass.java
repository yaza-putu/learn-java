package javaclass;

import java.util.Calendar;
import java.util.Date;

public class DateCalenderClass {

    // rekomendation gunakan java 8 date time atau calender

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        // calender
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -1);
        Date isNow = calendar.getTime();
        // add
        System.out.println(isNow);
    }
}
