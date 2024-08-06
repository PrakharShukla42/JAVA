import java.util.*;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] jagged = new int[2][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        int count = 0;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = count++;
            }
        }
        System.out.println("The values of 2D jagged array");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++)
                System.out.printf(jagged[i][j] + " ");
            System.out.println();
        }
    }
}
