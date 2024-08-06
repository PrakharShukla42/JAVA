import java.util.*;
public class hourGlass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int upperleft = n, upperright = n, lowerleft = 1, lowerright = 1;
        int lk = n, rk = 1, rr = rk, lr = lk;
        int upperspace = 0, lowerspace = n - 1, midspace = n;
        int lz = 1, lx = lz, rz = 1, rx = rz;
        int row = 1;
        while (row <= 2 * n + 1) {
            if (row <= (2 * n + 1) / 2) {
                lr = lk;
                rr = rz;
                for (int i = 1; i <= upperspace; i++) {
                    System.out.print("  ");
                }
                for (int i = 1; i <= upperleft; i++) {
                    System.out.print(lr + " ");
                    lr--;
                }
                System.out.print("0 ");

                for (int i = 1; i <= upperright; i++) {
                    System.out.print(rr + " ");
                    rr++;
                }
                upperleft = upperleft - 1;
                upperspace = upperspace + 1;
                lk--;
                upperright--;
            } else if (row == ((2 * n + 1) / 2) + 1) {
                for (int i = 1; i <= midspace; i++) {
                    System.out.print("  ");
                }
                System.out.print("0 ");
            } else if (row > (2 * n + 1) / 2) {
                lx = lz;
                rz = 1;
                for (int i = 1; i <= lowerspace; i++) {
                    System.out.print("  ");
                }
                for (int i = 1; i <= lowerleft; i++) {
                    System.out.print(lx + " ");
                    lx--;
                }
                System.out.print("0 ");
                for (int i = 1; i <= lowerright; i++) {
                    System.out.print(rz + " ");
                    rz++;
                }

                lowerspace--;
                lowerleft++;
                lz++;
                lowerright++;
            }
            System.out.println();
            row++;
        }
    }
}
