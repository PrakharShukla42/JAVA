import java.util.*;
public class InverseofNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int inverse = findInverse(n);
        System.out.println(inverse);
    }

    private static int findInverse(int n) {
        int inverse = 0;
        int position = 1;
        while (n > 0) {
            int digit = n % 10;
            inverse += position * (int) Math.pow(10, digit - 1);
            n /= 10;
            position++;
        }
        return inverse;
    }
}
