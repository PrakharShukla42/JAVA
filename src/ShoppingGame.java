import java.util.Scanner;
public class ShoppingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int a= 0;
            int h = 0;
            int r = 1;
            while (true) {
                if (1 == r % 2) {
                    if (a + r <= m) {
                        a += r;
                    } else {
                        System.out.println("Harshit");
                        break;
                    }
                } else {
                    if (h+ r <= n) {
                        h+= r;
                    } else {
                        System.out.println("Aayush");
                        break;
                    }
                }
                r++;
            }
        }
        scanner.close();
    }
}