package datetime.old;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InstanceOfCalendar {
    public static void main(String[] args) {
        // Calendar只有一种方式获取，即Calendar.getInstance()，而且一获取到就是当前时间。
        // 如果我们想给它设置成特定的一个日期和时间，就必须先清除所有字段：
        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(Calendar.YEAR, 2020);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DATE, 13);
        c.set(Calendar.HOUR_OF_DAY, 19);
        c.set(Calendar.MINUTE, 48);
        c.set(Calendar.SECOND, 45);

        // 利用Calendar.getTime()可以将一个Calendar对象转换为Date对象，然后使用SimpleDateFormat进行格式化：
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
    }
}
