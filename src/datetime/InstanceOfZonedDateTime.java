package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstanceOfZonedDateTime {
    public static void main(String[] args) {
        // 要创建一个ZonedDateTime对象，有以下几种方法，一种是通过now()方法返回当前时间：
        ZonedDateTime zdt = ZonedDateTime.now(); //默认时区
        ZonedDateTime zdtNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zdt);
        System.out.println(zdtNY + "\n");

        // 另一种方式是通过给一个LocalDateTime附加一个ZoneId，就可以变成ZonedDateTime；
        // 以这种方式创建的ZonedDateTime，它的日期和时间与LocalDateTime相同，但附加的时区不同，因此是两个不同的时刻：
        LocalDateTime ldt = LocalDateTime.of(2020, 11, 13, 20, 48, 17);
        ZonedDateTime zbj = ldt.atZone(ZoneId.systemDefault());
        ZonedDateTime zny = ldt.atZone(ZoneId.of("America/New_York"));
        System.out.println(zbj);
        System.out.println(zny + "\n");

        // 转换时区：1、ZoneDateTime对象；2、withZoneSameInstant()关联到另一个时区
        ZonedDateTime z = zdt.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(z);
    }
}
