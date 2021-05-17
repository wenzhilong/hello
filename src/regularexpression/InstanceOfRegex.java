package regularexpression;

import java.util.ArrayList;
import java.util.List;

/**
 * .匹配任意字符
 * \w匹配一个字母、数字或者下划线，\W匹配其他
 * \s匹配一个空格字符，\S匹配非空格字符
 * \d匹配一个数字，而\D匹配一个非数字
 *
 *  *匹配任意个、+匹配至少一个、？匹配0个或1个字符、{m, n}匹配n~m个字符
 */
public class InstanceOfRegex {
    public static void main(String[] args) {
        String regex = "20\\d\\d";
        System.out.println("2019".matches(regex)); // true
        System.out.println("2100".matches(regex)); // false

        String re = "\\d{3,4}-\\d{7,8}";
        List<String> firstList = new ArrayList<>();
        firstList.add("010-12345678");
        firstList.add("020-9999999");
        firstList.add("0755-7654321");
        for (String s : firstList) {
            if (!s.matches(re)) {
                System.out.println("测试失败: " + s);
                return;
            }
        }

        List<String> secondList = new ArrayList<>();
        secondList.add("010 12345678");
        secondList.add("A20-9999999");
        secondList.add("0755-7654.321");
        for (String s : secondList) {
            if (s.matches(re)) {
                System.out.println("测试失败: " + s);
                return;
            }
        }
        System.out.println("测试成功!");
    }
}
