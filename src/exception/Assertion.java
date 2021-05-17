package exception;

public class Assertion {
    public static void main(String[] args) {
        double x = Math.abs(-123.45);
        assert x >= 0: "x must >= 0";
        System.out.println(x);
    }
}
