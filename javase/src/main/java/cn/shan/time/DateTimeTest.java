package cn.shan.time;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DateTimeTest {
    public final static String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";

    @Test
    public void testDateTime(){

        calendar();
       String dateStr =  getBeforeOrFetrueDate(null,null,"0");
        String newDate = dateStr.substring(0,8);
       System.out.println(newDate);
/*
        currentTime();
*/

    }




    void calendar(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year+"年"+(month+1)+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒");
        calendar.add(Calendar.DAY_OF_MONTH,-9);
        Date date = new Date();
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(date);
        System.out.println(str);

        int year1 = calendar.get(Calendar.YEAR);
        int month1 = calendar.get(Calendar.MONTH);
        int day1 = calendar.get(Calendar.DATE);
        int hour1 = calendar.get(Calendar.HOUR_OF_DAY);
        int minute1 = calendar.get(Calendar.MINUTE);
        int second1= calendar.get(Calendar.SECOND);
        System.out.println(year1+"年"+(month1+1)+"月"+day1+"日"+hour1+"时"+minute1+"分"+second1+"秒");
    }



    void currentTime(){

        long sysMillisTime = System.currentTimeMillis();
        System.out.println("sysMillisTime:"+sysMillisTime);
        long calendarMillisTime =  Calendar.getInstance().getTimeInMillis();
        System.out.println("calendarMillisTime:"+calendarMillisTime);


    }

    /**
     *
     * 获取当前时间    比SimpleDateFormat 快
     * @return    String
     * @param
     * @param dateStr 时间分隔符
     * yearStr,dateStr都为空时返回格式：20161102095832
     * @throws
     */
    public static String getBeforeOrFetrueDate(String yearChr,String dateStr,String dayStr){
        StringBuilder sBuilder = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        int dayNum = Integer.parseInt(dayStr);
        calendar.add(Calendar.DAY_OF_MONTH,dayNum);
        int month = calendar.get(Calendar.MONTH)+1;
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int day = calendar.get(Calendar.DATE);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        sBuilder.append(calendar.get(Calendar.YEAR)).append(StringUtils.isNotEmpty(yearChr)?yearChr:"");
        sBuilder.append(month<10?"0"+month:month).append(StringUtils.isNotEmpty(yearChr)?yearChr:"");
        sBuilder.append(day<10?"0"+day:day).append(StringUtils.isNotEmpty(yearChr)&&StringUtils.isNotEmpty(dateStr)?" ":"");
        sBuilder.append(hour<10?"0"+hour:hour).append(StringUtils.isNotEmpty(dateStr)?dateStr:"");
        sBuilder.append(minute<10?"0"+minute:minute).append(StringUtils.isNotEmpty(dateStr)?dateStr:"");
        sBuilder.append(second<10?"0"+second:second);
        return sBuilder.toString();
    }
}
