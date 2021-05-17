package coreclasses;

/**
 * StringBuilder是可变对象，可以预分配缓冲区，这样，往StringBuilder中新增字符时，不会创建新的临时对象。
 */
public class BuilderOfString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(1024);
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(i)
                    .append(','); // 链式操作
        }
        // replace() delete()
        String s = stringBuilder.toString();
        System.out.println(s);
        System.out.println(s.length());

        StringBuilder sb = new StringBuilder(1024);
        // 进行链式操作的关键是，定义的append()方法会返回this，这样，就可以不断地调用自身的其他方法。
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());
    }
}
