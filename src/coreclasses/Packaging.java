package coreclasses;

/**
 * 所有包装类都是不变类，Integer的核心代码如下：
 * public final class Integer {
 *     private final int value;
 * }
 * 因此，一旦创建了Integer对象，该对象就是不变的。不能使用==比较，包装类是引用数据类型，必须使用equals()比较。
 *
 * 整数和浮点数的包装类型都继承自Number。
 */
public class Packaging {
    public static void main(String[] args) {
        int i = 100;
        Integer n1 = Integer.valueOf(i);
        System.out.println(n1.intValue());

        Integer n2 = i;  // 自动装箱和自动拆箱只发生在编译阶段，目的是为了少写代码。
        int i1 = n2;
        System.out.println(n2);
        System.out.println(n2.intValue());
        System.out.println(i1);

    }
}
