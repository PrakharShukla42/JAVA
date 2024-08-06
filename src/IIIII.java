import java.util.Scanner;
public class IIIII {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < N / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[N - 1 - i];
                arr[N - 1 - i] = temp;
            }
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }

            scanner.close();
        }
    }

