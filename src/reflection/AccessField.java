package reflection;

import java.lang.reflect.Field;
import java.time.Period;

/**
 * Class类提供了以下几个方法来获取字段：
 *
 * Field getField(name)：根据字段名获取某个public的field（包括父类）
 * Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
 * Field[] getFields()：获取所有public的field（包括父类）
 * Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
 */
public class AccessField {
    public static void main(String[] args) throws Exception{
        Class stdClass = Student.class; // 获取Student的Class实例

        // 获取字段：
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));

        // 获取字段值：
        Person p = new Person("Xiao Ming");
        Class cls = p.getClass();
        Field f = cls.getDeclaredField("name");
        Object value = f.get(p); // 获取字段值
        System.out.println(value);

        // 设置字段值：
        System.out.println(p.getName());
        f.set(p, "Xiao Hong"); // 设置字段值
        System.out.println(p.getName());

    }
}

class Student extends Person {
    public int score;
    private int grade;

    public Student(String name, int score, int grade) {
        super(name);
        this.score = score;
        this.grade = grade;
    }

    public int getScore(String type) {
        return 99;
    }

    public int getGrade(int year) {
        return 1;
    }
}

class Person {
    // 正常情况下，Main类无法访问Person类的private字段：
    // 法1、将private改为public；
    // 法2：在调用Object value = f.get(p)前，加一句：f.setAccessible(true); 意思是无论字段是否为public，一律允许访问。
    // f.setAccessible(true) 可能会失败。
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}