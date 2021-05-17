package datetime.old;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * 利用Calendar进行时区转换的步骤是：
 *
 * 清除所有字段；
 * 设定指定时区；
 * 设定日期和时间；
 * 创建SimpleDateFormat并设定目标时区；
 * 格式化获取的Date对象（注意Date对象无时区信息，时区信息存储在SimpleDateFormat中）。
 * 因此，本质上时区转换只能通过SimpleDateFormat在显示的时候完成。
 */
public class InstanceOfTimeZone {
    public static void main(String[] args) {
        TimeZone tzDefault = TimeZone.getDefault(); // 当前时区
        TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+09:00");
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
        System.out.println(tzDefault.getID());
        System.out.println(tzGMT9.getID());
        System.out.println(tzNY.getID());


        // 转换时区：
        Calendar c = Calendar.getInstance();
        c.clear(); // 清除所有字段
        c.setTimeZone(TimeZone.getDefault()); // 设定指定时区
        c.set(2020, Calendar.DECEMBER, 13, 20, 0, 0); // 设定指定日期和时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 创建SimpleDateFormat并格式化
        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York")); //设定目标时区
        System.out.println(sdf.format(c.getTime()));

        // 对日期和时间进行简单的加减：
        c.add(Calendar.DAY_OF_MONTH, 5);
        c.add(Calendar.HOUR_OF_DAY, -2);
        System.out.println(sdf.format(c.getTime()));
    }
}
