package com.suncor.coding.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @Author sunc
 * @Description 时间处理工具类
 * @info 2018/11/6 3:50 PM
 */
public class FormatUtil {

    private static SimpleDateFormat defaultFormat = new SimpleDateFormat("yyyyMMddHHmmss");

    public static final DateTimeFormatter DEFAULT_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static Date parseDate(String date) throws ParseException {
        return parseDate(date, defaultFormat);
    }

    public static Date parseDate(String date, DateFormat format) throws ParseException {
        return format.parse(date);
    }

    public static Date parseDate(String date, String format) throws ParseException {
        return new SimpleDateFormat(format).parse(date);
    }

    public static String formatDate(Date date) {
        return formatDate(date, defaultFormat);
    }

    public static String formatDate(Date date, DateFormat format) {
        return format.format(date);
    }

    public static String formatDate(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    public static String formatLocalDate(LocalDate localDate, String pattern){
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 给一个日期添加几个小时
     * @param date
     * @param interval
     * @return
     */
    public static Date plusHours(Date date,int interval){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, interval);
        return calendar.getTime();
    }

    /**
     * 给一个日期添加几个分钟
     * @param date
     * @param interval
     * @return
     */
    public static Date plusMins(Date date,int interval){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, interval);
        return calendar.getTime();
    }


    /**
     * 获得当前时间
     *
     * @return hhmmss
     */
    public static String getCurrentTimeStrNoDiv() {
        String curTimeSr = "";
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        curTimeSr = ((hour < 10) ? "0" + String.valueOf(hour) : String
                .valueOf(hour));
        curTimeSr += ((minute < 10) ? "0" + String.valueOf(minute) : String
                .valueOf(minute));
        curTimeSr += ((second < 10) ? "0" + String.valueOf(second) : String
                .valueOf(second));
        return curTimeSr;
    }

    /**
     * 获得当前时间，精度到毫秒
     *
     * @return hh:mm:ss.
     */
    public static String getCurrentTimeStr() {
        String curTimeSr = "";
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int milliSecond = cal.get(Calendar.MILLISECOND);
        curTimeSr = ((hour < 10) ? "0" + String.valueOf(hour) : String
                .valueOf(hour)) + ":";
        curTimeSr += ((minute < 10) ? "0" + String.valueOf(minute) : String
                .valueOf(minute)) + ":";
        curTimeSr += ((second < 10) ? "0" + String.valueOf(second) : String
                .valueOf(second));
        curTimeSr += "." + String.valueOf(milliSecond);
        return curTimeSr;
    }

    /**
     * 计算两个时间之间的时间差
     *
     * @param strDateTime1 减数，格式为yyyy-mm-dd hh-mm-ss
     * @param strDateTime2 被减数，格式为yyyy-mm-dd hh-mm-ss
     * @return strDateTime1 - strDateTime2的时间差，单位为毫秒
     */
    public static long computeInterval(String strDateTime1, String strDateTime2) {
        long interval = 0;
        Timestamp date1 = convertStrToDate(strDateTime1);
        Timestamp date2 = convertStrToDate(strDateTime2);
        interval = date1.getTime() - date2.getTime();
        return interval;
    }

    public static Timestamp convertStrToDate(String strDate) {
        if (strDate == null) {
            strDate = "1900-01-01 00:00:00.000";
        } else {
            if (strDate.trim().length() == 0) {
                strDate = "1900-01-01 00:00:00.000";
            } else if (strDate.trim().length() == 10) // 传入的日期不包含时间
            {
                strDate += " 00:00:00.000";
            } else if (strDate.trim().length() == 16) // 传入的日期包含时间到分钟位,如2000-01-01
            // 10:10
            {
                strDate += ":00.000";
            }
        }
        return Timestamp.valueOf(strDate);
    }

    /**
     * 将字符串转毫秒时间戳
     * @param timeStr 日期格式为：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static long convertTimeStrToLong(String timeStr){
//        Assert.notNull(timeStr, "时间为空");
        DateTimeFormatter ftf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(timeStr, ftf);
        return LocalDateTime.from(parse).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static LocalDateTime getLastTimeByTimeBlock(int timeBlock){
        switch (timeBlock){
            case 1:
                return LocalDateTime.now().minusDays(1);
            case 2:
                return LocalDateTime.now().minusDays(7);
            case 3:
                return LocalDateTime.now().minusMonths(1);
            default:
                return LocalDateTime.now();
        }
    }

    public static Date localDateTime2Date(LocalDateTime localDateTime){
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 生成随机码
     * @param length 随机码长度
     * @return
     */
    private static final char[] CHARS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static String generateRandomCode(int length){

        Random rand = new Random();
        StringBuilder randCode = new StringBuilder();
        for (int i=0; i<length; i++){
            char c = CHARS[rand.nextInt(CHARS.length-1)];
            randCode.append(c);
        }
        return randCode.toString();
    }


}
