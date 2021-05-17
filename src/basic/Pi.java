package basic;

public class Pi {
    public static void main(String[] args) {
        double pi = 0;
        for (int i = 0; i < 10000; i++) {
            pi = pi + 4 * (1.0 / (2 * i + 1) * Math.pow(-1, i));
        }

        System.out.println(pi);
    }
}
