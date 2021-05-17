package designpatterns.factorymethod;

/**
 * 实现一个解析字符串到Number的Factory：
 * 1、编写工厂接口；
 * 2、编写工厂接口的实现类；
 */
public class Main {
    // 客户端只需要和工厂接口NumberFactory以及抽象产品Number打交道：
    public static void main(String[] args) {
        NumberFactory factory = NumberFactory.getFactory();
        Number result = factory.parse("123.456");

        // 调用方可以完全忽略真正的工厂NumberFactoryImpl和实际的产品BigDecimal，
        // 这样做的好处是允许创建产品的代码独立地变换，而不会影响到调用方。
    }
}
