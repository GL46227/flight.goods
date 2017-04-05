/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.utils;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by gl46227 on 2017/3/28.
 */
public class DateUtil {
    public static final String DATEFORMAT_YMD_T_HMSSS = "yyyy-MM-dd\'T\'HH:mm:ss.SSS";
    public static final String DATEFORMAT_YMD_T_HMSS = "yyyy-MM-dd\'T\'HH:mm:ss.SS";
    public static final String DATEFORMAT_YMD_T_HMS = "yyyy-MM-dd\'T\'HH:mm:ss";
    public static final String DATEFORMAT_YMD_T_H = "yyyy-MM-dd\'T\'HH";
    public static final String DATEFORMAT_YMD_HMS = "yyyy-MM-dd HH:mm:ss";
    public static final String DATEFORMAT_YMD_HM = "yyyy-MM-dd HH:mm";
    public static final String DATEFORMAT_YMD = "yyyy-MM-dd";
    public static final String DATEFORMAT_HMS = "HH:mm:ss";
    public static final String DATEFORMAT_HM = "HH:mm";
    private Calendar calendar = Calendar.getInstance();

    public DateUtil() {
    }

    public static String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.format(new Date());
    }

    public static String getSSSXXXCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX");
        return sdf.format(new Date());
    }

    public static String getCurrentDate(String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(new Date());
    }

    public static String getFormatDate(Date date) {
        if(date == null) {
            date = new Date();
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(date);
    }

    public static String getFormatDate(Date date, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(date);
    }

    public static Date addDate(Date sourceDate, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sourceDate);
        calendar.add(5, days);
        return calendar.getTime();
    }

    public static Date addHour(Date sourceDate, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sourceDate);
        calendar.add(11, hours);
        return calendar.getTime();
    }

    public String getPreDate(String field, int amount) {
        this.calendar.setTime(new Date());
        return this.preDate(field, amount)?null:getFormatDate(this.calendar.getTime());
    }

    public String getPreDate(Date d, String field, int amount) {
        this.calendar.setTime(d);
        return this.preDate(field, amount)?null:getFormatDate(this.calendar.getTime());
    }

    private boolean preDate(String field, int amount) {
        if(field != null && !field.equals("")) {
            Calendar var10001;
            if(field.equals("y")) {
                var10001 = this.calendar;
                this.calendar.add(1, amount);
            } else if(field.equals("M")) {
                var10001 = this.calendar;
                this.calendar.add(2, amount);
            } else if(field.equals("d")) {
                var10001 = this.calendar;
                this.calendar.add(5, amount);
            } else if(field.equals("H")) {
                var10001 = this.calendar;
                this.calendar.add(10, amount);
            }

            return false;
        } else {
            return true;
        }
    }

    public String getPreDate(String date) throws ParseException {
        Date d = (new SimpleDateFormat()).parse(date);
        String preD = this.getPreDate(d, "d", 1);
        Date preDate = (new SimpleDateFormat()).parse(preD);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(preDate);
    }

    public static Date StrToDate(String str) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;

        try {
            date = format.parse(str);
        } catch (ParseException var4) {
            ;
        }

        return date;
    }

    public static Date StrToDate(String str, String formatStr) {
        SimpleDateFormat format = new SimpleDateFormat(formatStr);
        Date date = null;

        try {
            date = format.parse(str);
        } catch (ParseException var5) {
            ;
        }

        return date;
    }

    public static Calendar StrToCalendar(String str) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        Date date = null;

        try {
            date = format.parse(str);
        } catch (ParseException var5) {
            ;
        }

        calendar.setTime(date);
        return calendar;
    }

    public static String addDate(String date, int days, String dateFormat) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(StrToDate(date, dateFormat));
        calendar.add(5, days);
        return getFormatDate(calendar.getTime(), dateFormat);
    }

    public static Timestamp getCurrentTimestamp() {
        return new Timestamp(Calendar.getInstance().getTimeInMillis());
    }

    public static long getCurrentTime() {
        return getCurrentTimestamp().getTime();
    }

    public static long getDiffTime(Timestamp timestamp) {
        return getCurrentTimestamp().getTime() - timestamp.getTime();
    }

    public static Timestamp getTimestamp(String date) {
        return new Timestamp(StrToCalendar(date).getTimeInMillis());
    }

    public static Timestamp getTimestamp(String date, String format) {
        return new Timestamp(StrToCalendar(date, format).getTimeInMillis());
    }

    public static Timestamp getDiffTimestamp(String date, long timeInmillils) {
        return new Timestamp(StrToCalendar(date).getTimeInMillis() - timeInmillils);
    }

    public static Calendar StrToCalendar(String str, String formatStr) {
        SimpleDateFormat format = new SimpleDateFormat(formatStr);
        Calendar calendar = Calendar.getInstance();
        Date date = null;

        try {
            date = format.parse(str);
        } catch (ParseException var6) {
            ;
        }

        calendar.setTime(date);
        return calendar;
    }

    public static long getDiffDays(String date) {
        long days = 0L;
        Calendar startCalendar = StrToCalendar(getCurrentDate(), "yyyy/MM/dd");
        Calendar endCalendar = StrToCalendar(date, "yyyy-MM-dd");
        if(endCalendar.before(startCalendar)) {
            return days;
        } else {
            long times = endCalendar.getTimeInMillis() - startCalendar.getTimeInMillis();
            days = times / 86400000L;
            return days;
        }
    }

    public static int getWeekOfDay(Date day) throws Exception {
        new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(day);
        boolean weekOfDay = false;
        int weekOfDay1;
        if(c.get(7) == 1) {
            weekOfDay1 = 7;
        } else {
            weekOfDay1 = c.get(7) - 1;
        }

        return weekOfDay1;
    }

    public static String getCurrentDateMillis() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
        return sdf.format(new Date());
    }

    public static String getDateByMillis(long timeInMillis) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(timeInMillis);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
        return sdf.format(c.getTime());
    }

    public static long getDiffHours(String date) {
        long hours = 0L;
        Calendar startCalendar = StrToCalendar(date, "yyyy-MM-dd HH:mm:ss.sss");
        Calendar endCalendar = StrToCalendar(getCurrentDateMillis(), "yyyy-MM-dd HH:mm:ss.sss");
        if(endCalendar.before(startCalendar)) {
            return hours;
        } else {
            long times = endCalendar.getTimeInMillis() - startCalendar.getTimeInMillis();
            hours = times / 3600000L;
            return hours;
        }
    }

    public static long getDiffMinutes(String date) {
        long minutes = 0L;
        Calendar startCalendar = StrToCalendar(date, "yyyy-MM-dd HH:mm:ss.sss");
        Calendar endCalendar = StrToCalendar(getCurrentDateMillis(), "yyyy-MM-dd HH:mm:ss.sss");
        if(endCalendar.before(startCalendar)) {
            return minutes;
        } else {
            long times = endCalendar.getTimeInMillis() - startCalendar.getTimeInMillis();
            minutes = times / 60000L;
            return minutes;
        }
    }

    public static XMLGregorianCalendar dateToXMLGregorianCalendar(Date date) throws DatatypeConfigurationException {
        DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(date.getTime());
        return dataTypeFactory.newXMLGregorianCalendar(gc);
    }

    public static Date XMLGregorianCalendarToDate(XMLGregorianCalendar xMLGregorianCalendar) throws DatatypeConfigurationException {
        GregorianCalendar gc = xMLGregorianCalendar.toGregorianCalendar();
        return gc.getTime();
    }

    public static String getDiffHours(Integer hours, String dateFormat) {
        Date currentDate = new Date();
        currentDate.setHours(currentDate.getHours() + hours.intValue());
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(currentDate);
    }

    public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;

        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception var4) {
            ;
        }

        return gc;
    }

    public static Date convertToDate(XMLGregorianCalendar cal) {
        GregorianCalendar ca = cal.toGregorianCalendar();
        return ca.getTime();
    }
}
