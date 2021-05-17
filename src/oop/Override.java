package oop;

/**
 * Java的方法签名：方法名、参数列表，不包括返回值类型。
 *
 * 方法签名不同，就是Overload，Overload是一个新方法。
 * 方法签名相同，就是Override。
 *
 * 方法签名相同，返回值不同，也是不同的方法，在Java程序中，出现这种情况，编译器会报错。
 */
public class Override {
    public static void main(String[] args) {
        Person p = new Player();
        p.run();  // Java的实例方法调用时基于运行时的实际类型的动态调用，而非变量的声明类型，即多态(Polymorphic)。
        Player player = new Player();
        player.superRun();

    }
}

class Player extends Person {

    public void run() {
        System.out.println("Player.run()");
    }

    public void superRun() {
        super.run(); // 使用super调用父类被覆写的方法
    }
}