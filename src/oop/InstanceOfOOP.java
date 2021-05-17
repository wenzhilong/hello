package oop;

/**
 * 在Java中，创建对象实例的时候，按照如下顺序进行初始化：
 *
 * 1、先初始化字段，例如：
 * int age = 10，表示字段初始化为10，
 * double salary，表示字段默认初始化为0，
 * String name，表示引用类型字段默认初始化为null；
 *
 * 2、执行构造方法的代码进行初始化。
 *
 * 因此，由于构造方法的代码后运行，所以，new Person("Xiao Ming", 12)的字段值最终由构造方法的代码确定。
 */
public class InstanceOfOOP {
    public static void main(String[] args) {
        Person person = new Person("Xiao Ming", "male", 15);
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}

