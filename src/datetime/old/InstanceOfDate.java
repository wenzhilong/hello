package datetime.old;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class InstanceOfDate {
    public static void main(String[] args) {
        // 获取当前时间：
        Date date = new Date();
        System.out.println(date.getTime()); // 时间戳
        System.out.println(date.toString());

        // 自定义格式化：
        SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd, yyyy");
        System.out.println(sdf.format(date));

        // 获取当前日期：
        Calendar c = Calendar.getInstance(); // Calendar.getInstance()是获取Calendar的唯一方式，而且获取到的是当前时间。
        int y = c.get(Calendar.YEAR);
        int m = 1 + c.get(Calendar.MONTH); // 返回的月份任然要+1
        int d = c.get(Calendar.DAY_OF_MONTH);
        int w = c.get(Calendar.DAY_OF_WEEK); // 返回的1~7代表周日、周一......、周六
        int hh = c.get(Calendar.HOUR_OF_DAY);
        int mm = c.get(Calendar.MINUTE);
        int ss = c.get(Calendar.SECOND);
        int ms = c.get(Calendar.MILLISECOND);
        System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm + ":" + ss + "." + ms);

    }
}
