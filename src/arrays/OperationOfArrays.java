package arrays;

import java.util.Arrays;

public class OperationOfArrays {
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};

        // 打印数组内容：
        System.out.println(Arrays.toString(ns));

        // for循环遍历数组：
        for (int i = 0; i < ns.length; i++) {
            System.out.print(ns[i] + " ");
        }

        // for each循环遍历数组：
        System.out.println();
        for (int i: ns) {
            System.out.print(i + " ");
        }

        // 逆序遍历数组：
        System.out.println();
        for (int i = ns.length - 1; i >= 0; i--) {
            System.out.print(ns[i] + " ");
        }
    }
}
