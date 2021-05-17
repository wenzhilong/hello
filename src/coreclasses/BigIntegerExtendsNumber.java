package coreclasses;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Java中，CPU提供的最大整型是64位的long型整数，使用long型整数可以直接通过CPU指令进行计算。
 *
 * java.math.BigInteger用来表示任意大小的整数，BigInteger内部使用int[]数组来模拟一个非常大的整数。
 *
 * BigInteger是不变类，继承自Number。
 */
public class BigIntegerExtendsNumber {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5));

        BigInteger bb = new BigInteger("12345678901234567890");

        // BigInteger做运算时，只能使用实例方法：
        BigInteger sum = bi.add(bb);

        // 转换为long型：
        System.out.println(bi.longValue()); // 非准确转换，超过范围丢失高位信息。
        System.out.println(bi.longValueExact());  // 准确转换，超过范围会抛出异常。
    }
}
