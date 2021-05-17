package designpatterns.factorymethod;

/**
 * 客户端如何创建NumberFactoryImpl？
 * 通常会在接口Factory中定义一个静态方法getFactory()来返回真正的子类：
 */
public interface NumberFactory {
    // 创建方法：
    Number parse(String s);

    // 获取工厂实例：
    static NumberFactory getFactory() {
        return impl; // 返回真正的子类
    }

    static NumberFactory impl = new NumberFactoryImpl();
}
