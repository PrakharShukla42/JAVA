import java.util.*;
public class StringConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (isUnitDistanceApart(s1, s2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isUnitDistanceApart(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (Math.abs(m - n) > 1) {
            return false;
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
                }
            }
        }
        return dp[m][n] == 1;
    }
}