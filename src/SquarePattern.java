import java.util.*;
public class SquarePattern {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j * j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}