package coreclasses;

/**
 * 因为enum类型的每个常量在JVM中只有一个唯一实例，所以可以直接用==比较。
 *
 * 通过enum定义的枚举类，和其他的class有什么区别？
 *
 * 答案是没有任何区别。enum定义的类型就是class，只不过它有以下几个特点：
 *
 * 定义的enum类型总是继承自java.lang.Enum，且无法被继承；
 * 只能定义出enum的实例，而无法通过new操作符创建enum的实例；
 * 定义的每个实例都是引用类型的唯一实例；
 * 可以将enum类型用于switch语句。
 */
public class Enum {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day == Weekday.SUN || day == Weekday.SAT || day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
    }
}

enum Weekday {
    // 每个枚举值都是enum的实例，只能定义实例，不能使用new来创建实例。
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int dayValue;
    private final String Chinese;

    // ordinal()返回定义的常量的顺序，从0开始计数，当常量的顺序发生变化，编号也会变化。
    // 定义构造方法，并且给每一个枚举常量添加字段，这样就无需担心顺序的变化，新增枚举常量时，也需要指定int值。
    Weekday(int dayValue, String Chinese) {
        this.dayValue = dayValue;
        this.Chinese = Chinese;
    }

    // name()返回常量名，如：String s = Weekday.SUN.name();  // "SUN"

    // 默认情况下，对枚举常量调用toString()会返回和name()一样的字符串，但是toString()可以被覆写，而name()不行：
    @Override
    public String toString() {
        return this.Chinese;
    }
}