package coreclasses;

import java.math.BigDecimal;

/**
 * BigDecimal可以表示一个任意大小且精度完全准确的浮点数。从Number继承，是不可变类：
 * public class BigDecimal extends Number implements Comparable<BigDecimal> {
 *     private final BigInteger intVal; // 表示完整的整数
 *     private final int scale; // 表示小数位数
 * }
 *
 * BigDecimal用于表示精确的小数，常用于财务计算；
 *
 * 比较BigDecimal的值是否相等，必须使用compareTo()而不能使用equals()。
 */
public class BigDecimalExtendsNumber {
    public static void main(String[] args) {

        BigDecimal bd = new BigDecimal("123.4567");
        System.out.println(bd.multiply(bd));

        BigDecimal d1 = new BigDecimal("123.45");
        BigDecimal d2 = new BigDecimal("123.4500");
        BigDecimal d3 = new BigDecimal("1234500");

        // scale()表示小数位数：
        System.out.println(d1.scale()); // 2
        System.out.println(d2.scale()); // 4
        System.out.println(d3.scale()); // 0

        // 使用compareTo()比较两个BigDecimal的值，不能使用equals()
        int result = d1.compareTo(d2);
        switch (result) {
            case -1:
                System.out.println("d1小于d2！");
            case 0:
                System.out.println("d1和d2相同！");
                break;
            case 1:
                System.out.println("d1大于d2！");
                break;
            default:
                System.out.println("d1和d2不相同！");
                break;
        }
    }
}
