package coreclasses;

import java.util.Arrays;

public class StringAndEncoding {
    public static void main(String[] args) {
        // String是引用数据类型，它本身也是一个class。但是，Java编译器对String有特殊处理：
        String s1 = "hello";
        // 实际上字符串在String内部是通过一个char[]数组表示的，因此，按下面的写法也是可以的：
        String s2 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});


        // String的不可变性是通过内部的private final char[]字段，以及没有任何修改char[]的方法实现的。
        String s3 = s1;

        s1 = s1.toUpperCase();

        System.out.println(s1);
        System.out.println(s3);

        String s4 = "hello";

        // 比较字符串的内容是否相同，必须使用equals()方法，而不是==
        // Java编译器在编译期，会把所有相同的字符串当做一个对象放入常量池，自然s3和s4的引用就是相同的，s2和s3的引用是不同的。
        System.out.println(s4 == s3); // true
        System.out.println(s2 == s3); // false
        System.out.println(s2.equals(s3)); // true equalsIgnoreCase()


        System.out.println("-----------------------");
        int[] scores = {88, 77, 51, 66};
        Score score = new Score(scores);
        score.printScores();

        scores[2] = 99;
        score.printScores();
    }
}

class Score {
    private int[] scores;
    public Score(int[] scores) {
        // this.scores = scores;  scores直接引用了外部传入的int[]数组，会造成外部代码对int[]数组的修改，影响到Scores的字段。
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}