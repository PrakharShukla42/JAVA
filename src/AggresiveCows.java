import java.util.*;
public class AggresiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] stalls = new int[N];

        for (int i = 0; i < N; i++) {
            stalls[i] = sc.nextInt();
        }

        Arrays.sort(stalls);

        int result = largestMinimumDistance(stalls, N, C);
        System.out.println(result);
    }

    public static int largestMinimumDistance(int[] stalls, int N, int C) {
        int left = 0;
        int right = stalls[N - 1] - stalls[0];
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isFeasible(stalls, N, C, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static boolean isFeasible(int[] stalls, int N, int C, int distance) {
        int count = 1;
        int prevStall = stalls[0];

        for (int i = 1; i < N; i++) {
            if (stalls[i] - prevStall >= distance) {
                count++;
                prevStall = stalls[i];
            }
        }

        return count >= C;
    }
}
