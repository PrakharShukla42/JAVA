import java.util.*;
public class Alex {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the number of items in the shop
            int n = scanner.nextInt();

            // Read the prices of the items into an array
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = scanner.nextInt();
            }

            // Sort the prices array in ascending order
            Arrays.sort(prices);

            // Read the number of queries
            int q = scanner.nextInt();

            for (int i = 0; i < q; i++) {
                int A = scanner.nextInt();
                int k = scanner.nextInt();

                // Find the maximum number of items Alex can buy with her money A
                int maxItems = binarySearchMaxItems(prices, A);

                // Check if the shopkeeper's claim is correct
                if (maxItems >= k) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }

            scanner.close();
        }

        // Binary search to find the maximum number of items Alex can buy with her money A
        static int binarySearchMaxItems(int[] prices, int A) {
            int left = 0;
            int right = prices.length - 1;
            int maxItems = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (prices[mid] <= A) {
                    maxItems = mid + 1; // Update the maxItems count
                    left = mid + 1; // Search the right half
                } else {
                    right = mid - 1; // Search the left half
                }
            }

            return maxItems;
        }
    }
