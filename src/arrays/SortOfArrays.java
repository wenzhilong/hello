package arrays;

import java.util.Arrays;

public class SortOfArrays {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println("排序前：" + Arrays.toString(ns));
        Arrays.sort(ns);  // 对数组排序实际上改变了数组本身，数组每个元素的指向发生了改变。
        System.out.println("升序后：" + Arrays.toString(ns));

        // 冒泡法降序数组：
        for (int i = 0; i < ns.length -1; i++) {  // 冒泡次数为数组长度-1
            for (int j = 0; j < ns.length - i -1; j++) { // 根据冒泡的序号，确定每次冒泡需要的比较次数
                if (ns[j] < ns[j+1]) {
                    int temp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = temp;
                }
            }
        }
        System.out.println("降序后：" + Arrays.toString(ns));

        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
