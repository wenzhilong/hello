package reflection;

import java.lang.reflect.Method;

/**
 * Class类提供了以下几个方法来获取Method：
 *
 * Method getMethod(name, Class...)：获取某个public的Method（包括父类）
 * Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
 * Method[] getMethods()：获取所有public的Method（包括父类）
 * Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）
 */
public class CallMethod {
    public static void main(String[] args) throws Exception{
        Class stdClass = Student.class;
        // 获取public方法getScore()，参数为String：
        System.out.println(stdClass.getMethod("getScore", String.class));

        // 获取继承的public方法getName()，无参数：
        System.out.println(stdClass.getMethod("getName"));

        // 获取private方法getGrade()，参数为int：
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));

        // 调用方法：
        String s = "hello, world";
        // 获取方法：
        Method m = String.class.getMethod("substring", int.class);
        // 在s对象上调用方法并获取结果：对Method实例调用invoke()就相当于调用该方法，第一个参数是实例、后面的可变参数要与方法参数一致
        System.out.println((String) m.invoke(s, 6));

        // 调用静态方法：
        Method staticMethod = Integer.class.getMethod("parseInt", String.class);
        // 由于无需指定实例对象，所有invoke()方法传入的第一个参数永远是null：
        System.out.println((Integer) staticMethod.invoke(null, "12345"));

        // 调用非public方法：
        Person p = new Person("Harry");
        Method method = p.getClass().getDeclaredMethod("setName", String.class);
        method.setAccessible(true);
        method.invoke(p, "Harry Potter");
        System.out.println(p.name);



    }
}

