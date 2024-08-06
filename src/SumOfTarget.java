import java.util.Arrays;
import java.util.Scanner;
public class SumOfTarget {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the number of elements (N)
            int N = scanner.nextInt();

            // Create an array to store the elements
            int[] arr = new int[N];

            // Read the elements and store them in the array
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            // Read the target sum
            int target = scanner.nextInt();

            // Sort the array to simplify the pair search
            Arrays.sort(arr);

            // Find pairs that sum up to the target
            int left = 0;
            int right = N - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    System.out.println(arr[left] + " and " + arr[right]);
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

            scanner.close();
        }
    }

