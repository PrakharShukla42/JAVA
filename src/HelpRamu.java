import java.util.Scanner;
public class HelpRamu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt(); // Number of test cases

            while (t-- > 0) {
                int c1 = scanner.nextInt();
                int c2 = scanner.nextInt();
                int c3 = scanner.nextInt();
                int c4 = scanner.nextInt();

                int n = scanner.nextInt();
                int m = scanner.nextInt();

                int[] rickshaws = new int[n];
                int[] cabs = new int[m];

                for (int i = 0; i < n; i++) {
                    rickshaws[i] = scanner.nextInt();
                }

                for (int i = 0; i < m; i++) {
                    cabs[i] = scanner.nextInt();
                }

                int rickshawCost = 0;
                int cabCost = 0;

                for (int i = 0; i < n; i++) {
                    rickshawCost += Math.min(c1 * rickshaws[i], c2);
                }

                for (int i = 0; i < m; i++) {
                    cabCost += Math.min(c1 * cabs[i], c2);
                }

                int totalCost = Math.min(rickshawCost + cabCost, c3);
                totalCost = Math.min(totalCost, c4);

                System.out.println(totalCost);
            }

            scanner.close();
        }
    }

