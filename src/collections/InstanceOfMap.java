package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Map中不存在重复的key，因为放入相同的key，只会把原有的key-value对应的value给替换掉。
 */
public class InstanceOfMap {
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 99);
        Map<String, Student> map = new HashMap<>();
        map.put("Xiao Ming", s); // 将"Xiao Ming"和Student实例映射并关联
        Student target = map.get("Xiao Ming"); // 通过key查找并返回映射的Student实例
        System.out.println(target == s); // true，同一个实例
        System.out.println(target.score); // 99
        Student another = map.get("Bob"); // 通过另一个key查找
        System.out.println(another); // 未找到返回null

        // 遍历Map时，不可假设输出的key是有序的！

        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("apple", 123);
        newMap.put("pear", 456);
        newMap.put("banana", 789);

        // 遍历key：
        System.out.println("----------遍历Map----------");
        for (String key: newMap.keySet()) {
            Integer value = newMap.get(key);
            System.out.println(key + " = " + value);
        }

        // 同时遍历key-value：
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}

class Student {
    public String name;
    public int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}