package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        int amPm = cal.get(Calendar.AM_PM);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        String strAmPm = null;
        if (amPm == Calendar.AM) {
            strAmPm = "오전";
        }
        else{
            strAmPm = "오후";
        }

        String strWeek = null;
        switch (week) {
            case Calendar.MONDAY: strWeek = "월요일"; break;
            case Calendar.TUESDAY: strWeek = "화요일"; break;
            case Calendar.WEDNESDAY: strWeek = "수요일"; break;
            case Calendar.THURSDAY: strWeek = "목요일"; break;
            case Calendar.FRIDAY: strWeek = "금요일"; break;
            case Calendar.SATURDAY: strWeek = "토요일"; break;
            default : strWeek = "일요일"; break;
        }

        //2024년 6월 18일
        //화요일 오후
        //0시 25분 0초
        System.out.printf("%04d년 %01d월 %02d일\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
        System.out.printf("%s %s\n", strWeek,strAmPm);
        System.out.printf("%d시 %02d분 %d초", hour, minute, second);
    }
}
