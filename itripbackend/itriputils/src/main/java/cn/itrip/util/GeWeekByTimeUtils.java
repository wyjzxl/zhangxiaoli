package cn.itrip.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeWeekByTimeUtils {
    public static String getWeek(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String week = sdf.format(date);
        return week;
    }
}
