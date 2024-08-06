import java.util.*;
public class PatternMountain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print("\t");
            }
            for (int j = i; j >= 1; j--) {
                if (j == N) {
                    System.out.print(j);
                } else {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
    }
}
