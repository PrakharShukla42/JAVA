
import java.util.Arrays;
import java.util.Scanner;
public class New {
/*        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
                int[] result = sortedSquares(nums);
                for (int i = 0; i < n; i++) {
                    System.out.print(result[i] + " ");
                }
                scanner.close();
            }
            public static int[] sortedSquares(int[] nums) {
                int n = nums.length;
                int[] result = new int[n];
                int left = 0;
                int right = n - 1;
                int index = n - 1;
                while (left <= right) {
                    int leftSquare = nums[left] * nums[left];
                    int rightSquare = nums[right] * nums[right];
                    if (leftSquare > rightSquare) {
                        result[index--] = leftSquare;
                        left++;
                    }
                    else {
                        result[index--] = rightSquare;
                        right--;
                    }
                }
                return result;
            }
        }
*/
/*
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the length of the array
            int n = scanner.nextInt();
            int[] nums = new int[n];

            // Read the array elements
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            // Call the function to square and sort the array
            int[] result = sortedSquares(nums);

            // Print the sorted squared array
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }

            scanner.close();
        }

        public static int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            int left = 0;
            int right = n - 1;
            int index = n - 1;

            while (left <= right) {
                int leftSquare = nums[left] * nums[left];
                int rightSquare = nums[right] * nums[right];

                if (leftSquare > rightSquare) {
                    result[index--] = leftSquare;
                    left++;
                } else {
                    result[index--] = rightSquare;
                    right--;
                }
            }

            return result;
        }
    }
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows and columns
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Create a two-dimensional array
        int[][] arr = new int[M][N];

        // Read the array elements
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Call the function to print in anti-clockwise spiral form
        spiralAntiClockwise(arr);

        scanner.close();
    }

    public static void spiralAntiClockwise(int[][] arr) {
        int M = arr.length; // Number of rows
        int N = arr[0].length; // Number of columns

        int top = 0;
        int bottom = M - 1;
        int left = 0;
        int right = N - 1;

        StringBuilder result = new StringBuilder();

        while (top <= bottom && left <= right) {
            // Traverse the top row
            for (int i = top; i <= bottom; i++) {
                result.append(arr[i][left]).append(", ");
            }
            left++;

            // Traverse the leftmost column
            for (int i = left; i <= right; i++) {
                result.append(arr[bottom][i]).append(", ");
            }
            bottom--;

            // Traverse the bottom row
            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    result.append(arr[i][right]).append(", ");
                }
                right--;
            }

            // Traverse the rightmost column
            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.append(arr[top][i]).append(", ");
                }
                top++;
            }
        }

        // Remove the trailing ", " and print "END"
        result.delete(result.length() - 2, result.length());
        result.append(" END");

        System.out.println(result);
    }
}

