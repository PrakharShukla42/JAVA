import java.util.Scanner;
public class LinearSerch {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int target = scanner.nextInt();
            int index = findIndex(arr, target);
            System.out.println(index);

            scanner.close();
        }static int findIndex(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }
