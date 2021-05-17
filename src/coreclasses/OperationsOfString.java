package coreclasses;

public class OperationsOfString {
    public static void main(String[] args) {
        String s = "Hello";

        // 搜索子串：
        // 是否包含子串，参数是CharSequence，而不是String，因为CharSequence是String的父类：
        System.out.println(s.contains("ll")); // true
        System.out.println(s.indexOf("l")); // 2
        System.out.println(s.lastIndexOf("l")); // 3
        System.out.println(s.startsWith("He")); // true
        System.out.println(s.endsWith("lo")); // true

        // 提取子串：
        System.out.println(s.substring(2)); // llo
        System.out.println(s.substring(2, 4)); // ll


    }
}
