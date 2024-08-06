import java.util.*;
public class R2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        while (k != 0) {
            if (k % 2 != 0)
                System.out.println(k);
            k--;
        }
        while (k <= n) {
            if (k % 2 == 0 && k != 0)
                System.out.println(k);
            k++;
        }
    }
}
