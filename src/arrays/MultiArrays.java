package arrays;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 }
        };

        // 打印二维数组内容：
        System.out.println(Arrays.deepToString(ns) + " " + ns.length);

        // 遍历二维数组：
        int count = 0;
        for (int[] temp : ns) {
            for (int item : temp) {
                System.out.print(item + " ");
                count++;
            }
            System.out.println(); // 换行
        }
        System.out.println(count);
    }
}
