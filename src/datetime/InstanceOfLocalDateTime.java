package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 从Java 8开始，java.time包提供了新的日期和时间API，主要涉及的类型有：
 *
 * 本地日期和时间：LocalDateTime，LocalDate，LocalTime；
 * 带时区的日期和时间：ZonedDateTime；
 * 时刻：Instant；
 * 时区：ZoneId，ZoneOffset；
 * 时间间隔：Duration。
 * 以及一套新的用于取代SimpleDateFormat的格式化类型DateTimeFormatter。
 *
 * 和旧的API相比，新API严格区分了时刻、本地日期、本地时间和带时区的日期时间，并且，对日期和时间进行运算更加方便。
 *
 * 此外，新API修正了旧API不合理的常量设计：
 *
 * Month的范围用1~12表示1月到12月；
 * Week的范围用1~7表示周一到周日。
 * 最后，新API的类型几乎全部是不变类型（和String类似），可以放心使用不必担心被修改。
 *
 * LocalDateTime
 */
public class InstanceOfLocalDateTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now(); // 当前日期
        LocalTime t = LocalTime.now(); // 当前时间
        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间

        // 上述代码其实有一个小问题，在获取3个类型的时候，由于执行一行代码总会消耗一点时间，
        // 因此，3个类型的日期和时间很可能对不上（时间的毫秒数基本上不同）。
        // 为了保证获取到同一时刻的日期和时间，可以改写如下：
        //LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
        //LocalDate d = dt.toLocalDate(); // 转换到当前日期
        //LocalTime t = dt.toLocalTime(); // 转换到当前时间

        System.out.println(dt); // 严格按照ISO 8601格式打印
        System.out.println(d);
        System.out.println(t);

        // 反过来，通过指定的日期和时间创建LocalDateTime可以通过of()方法：
        LocalDate d2 = LocalDate.of(2019, 11, 30); // 2019-11-30, 注意11=11月
        LocalTime t2 = LocalTime.of(15, 16, 17); // 15:16:17
        LocalDateTime dt2 = LocalDateTime.of(2019, 11, 30, 15, 16, 17);
        LocalDateTime dt3 = LocalDateTime.of(d2, t2);

//        因为严格按照ISO 8601的格式，因此，将字符串转换为LocalDateTime就可以传入标准格式：
//
//        LocalDateTime dt = LocalDateTime.parse("2019-11-19T15:16:17");
//        LocalDate d = LocalDate.parse("2019-11-19");
//        LocalTime t = LocalTime.parse("15:16:17");
    }


}
