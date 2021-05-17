package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 用Pattern对象匹配，匹配后获得一个Matcher对象，如果匹配成功，就可以直接从Matcher.group(index)返回子串：
 *
 * String.matches()方法内部调用的就是Pattern和Matcher类的方法。
 *
 * 但是反复使用String.matches()对同一个正则表达式进行多次匹配效率较低，因为每次都会创建出一样的Pattern对象。
 *
 * 完全可以先创建出一个Pattern对象，然后反复使用，就可以实现编译一次，多次匹配：
 */
public class ComplicatedInstance {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher m = p.matcher("010-12345678");
        // 使用Matcher时，必须首先调用matches()判断是否匹配成功，匹配成功后，才能调用group()提取子串：
        if (m.matches()) {
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        } else {
            System.out.println("匹配失败！");
        }

    }
}
