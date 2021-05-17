package oop;

/**
 * 方法名相同，但各自的参数不同，称为方法重载Overload：
 * 方法重载的返回值类型通常都是相同的。
 * 方法重载的目的是：功能类似的方法使用同一名字，更容易记住，因此，调用时更简单。
 */
public class Overload {
    public static void main(String[] args) {
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("Xiao Ming");
        hong.setName("Xiao", "Hong"); // 给Person类添加重载方法setName(String, String)

        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}
