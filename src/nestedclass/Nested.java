package nestedclass;

public class Nested {
    public static void main(String[] args) {
        // 匿名类：
        Outer outer = new Outer("nested");
        outer.asyncHello();

        // 非静态内部类：
        Outer.Inner inner = outer.new Inner();
        inner.hello();

        // 静态内部类：
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.hello();
    }
}

class Outer {
    private final String name;
    private static final String NAME = "OUTER";

    Outer(String name) {
        this.name = name;
    }

    void asyncHello() {
        // 匿名类应改写为lambda表达式
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello, " + Outer.this.name);
            }
        };
        new Thread(r).start();
    }

    class Inner {
        void hello() {
//            System.out.println("hello, " + Outer.this.name);
            System.out.println("hello, " + name);  // 作为非静态内部类，可以直接访问Outer的实例属性和实例方法
        }
    }

    /**
     * 静态内部类不再依附于Outer的实例，而是一个完全独立的类，因此无法引用Outer.this，但可以访问Outer的静态字段和静态方法。
     * 如果将StaticNested移动到Outer之外，就失去了访问Outer的private的权限。
     */
    static class StaticNested {
        void hello() {
            System.out.println("hello, " + Outer.NAME);  // 静态内部类不能直接访问Outer的实例属性和实例方法，
        }
    }
}
