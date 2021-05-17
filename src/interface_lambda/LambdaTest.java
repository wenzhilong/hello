package interface_lambda;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;


/**
 * public interface Comparable {
 *     // 任何一个实现Comparable接口的类都需要包含compareTo()方法，并且这个方法的参数必须是一个Object对象，返回一个int型：
 *     // 接口声明中，compareTo()方法没有声明为public，因为接口中的方法自动是public，但是实现接口时，必须将方法声明为public。
 *     int compareTo(Object other);
 * }
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] plants = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(plants));

        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));

        System.out.println("Sorted by length: ");
        Arrays.sort(plants, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(plants));

        Timer timer = new Timer(1000, event -> {
            System.out.println("The time is" + new Date());
            Toolkit.getDefaultToolkit().beep();
        });
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

