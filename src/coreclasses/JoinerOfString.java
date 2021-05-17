package coreclasses;

import java.util.StringJoiner;

/**
 * 在不需要指定“开头”和“结尾”的时候，用String.join()更方便。
 * String[] names = {"Bob", "Alice", "Grace"};
 * String s = String.join(", ", names);
 */
public class JoinerOfString {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        StringJoiner sj = new StringJoiner(", ", "Hello ", "!"); // 分割符、开始、 结尾
        for (String name: names) {
            sj.add(name);
        }

        System.out.println(sj.toString());
    }
}
