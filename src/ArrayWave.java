import java.util.*;
public class ArrayWave {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] matrix = new int[m][n];

            // Input the matrix
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Perform anti-clockwise spiral traversal
            StringBuilder result = new StringBuilder();
            int top = 0, bottom = m - 1, left = 0, right = n - 1;
            while (top <= bottom && left <= right) {
                // Traverse left column
                for (int i = bottom; i >= top; i--) {
                    result.append(matrix[i][left]).append(", ");
                }
                left++;

                // Traverse top row
                for (int i = left; i <= right; i++) {
                    result.append(matrix[top][i]).append(", ");
                }
                top++;

                // Traverse right column
                for (int i = top; i <= bottom; i++) {
                    result.append(matrix[i][right]).append(", ");
                }
                right--;

                // Traverse bottom row
                for (int i = right; i >= left; i--) {
                    result.append(matrix[bottom][i]).append(", ");
                }
                bottom--;
            }

            // Remove the trailing ", " and add "END"
            if (result.length() > 0) {
                result.setLength(result.length() - 2);
                result.append("END");
            }

            // Print the result
            System.out.println(result.toString());

            sc.close();
        }
    }
