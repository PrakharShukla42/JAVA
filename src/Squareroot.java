import java.util.*;
public class Squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            double squareRoot = Math.sqrt(N);
            System.out.printf("%.4f%n", squareRoot);
        }
    }
}

