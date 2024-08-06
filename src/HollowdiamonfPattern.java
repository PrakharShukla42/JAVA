import java.util.*;
public class HollowdiamonfPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nst = (N + 1) / 2;
        int nr = N;
        int row = 1;
        int nsp = 1;
        while (row <= N && N % 2 == 1 && N > 0 && N < 10) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*    ");
            }
            int csp = 1;
            if (row == 1 || row == N) {
                csp = 2;
            }
            for (; csp <= nsp; csp++) {
                System.out.print("     ");
            }
            int cst = 1;
            if (row == 1 || row == N) {
                cst = 2;
            }
            for (; cst <= nst; cst++) {
                System.out.print("*    ");
            }
            System.out.println();
            if (row <= nr / 2) {
                if (row != 1) {
                    nsp = nsp + 2;
                }
                nst--;
            } else {
                nsp = nsp - 2;
                nst++;
            }
            row++;
        }
    }
}