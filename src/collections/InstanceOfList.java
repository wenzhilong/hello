package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstanceOfList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // 在遍历数组、集合时，forEach()比for循环快：
        list.forEach(System.out::println);
    }
}
