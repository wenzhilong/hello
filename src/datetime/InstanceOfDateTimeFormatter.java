package datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 如果要自定义输出的格式，或者要把一个非ISO 8601格式的字符串解析成LocalDateTime，可以使用新的DateTimeFormatter：
 */
public class InstanceOfDateTimeFormatter {
    public static void main(String[] args) {
        // 自定义格式化：
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

        // 用自定义格式解析：
        LocalDateTime dt = LocalDateTime.parse("2020/11/13 20:23:34", dtf);
        System.out.println(dt);

        // LocalDateTime提供了对日期和时间进行加减的非常简单的链式调用：
        LocalDateTime dt2 = dt.plusDays(5).minusHours(3);  // 加5天减3小时:
        System.out.println(dt2);

        LocalDateTime dt3 = dt2.minusMinutes(1); // 减1个月
        System.out.println(dt3);

        // 调整日期和时间使用withxxx()方法：
        System.out.println(dt.withDayOfMonth(30));
        System.out.println(dt.withMonth(9));

        // 实际上，LocalDateTime还有一个通用的with()方法允许我们做更复杂的运算。
        // 要判断两个LocalDateTime的先后，可以使用isBefore()、isAfter()方法，对于LocalDate和LocalTime类似。
        // Duration表示两个时刻之间的时间间隔。另一个类似的Period表示两个日期之间的天数：
        Duration d = Duration.between(dt2, dt3); // 比较两个时刻必须带有时间信息
        System.out.println(d);

        Period p = dt.toLocalDate().until(dt2.toLocalDate()); // 比较天数只能是Date，不能带有时间信息。
        System.out.println(p);

    }
}
