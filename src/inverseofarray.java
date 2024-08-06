import java.util.*;
public class inverseofarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        invertArray(arr, 0, N - 1);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    private static void invertArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        invertArray(arr, start + 1, end - 1);
    }
}