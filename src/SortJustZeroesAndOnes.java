import java.util.*;
public class SortJustZeroesAndOnes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sequence = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }
        int[] count = new int[2];
        for (int i = 0; i < N; i++) {
            count[sequence[i]]++;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < count[i]; j++) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
