import java.util.*;
public class FabonnaciPattern {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N <= 0 || N >= 100) {
            System.out.println("Invalid input");
            return;
        }
        int a = 0, b = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                int sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println();
        }
    }
}