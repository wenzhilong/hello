package basic;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, world");

        // 浮点数的默认类型是double型，float型加f。
        int[] ns = {68, 79, 91, 85, 62};
        for (int n : ns) {
            System.out.println(n);
        }

        System.out.println(ns.length);
        ns = new int[] {1, 2, 3};
        System.out.println(ns.length);
    }
}
