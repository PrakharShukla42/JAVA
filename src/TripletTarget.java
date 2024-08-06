import java.util.Arrays;
import java.util.Scanner;
public class TripletTarget {
    /*   public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           int N = scanner.nextInt();
           int[] arr = new int[N];
           for (int i = 0; i < N; i++) {
               arr[i] = scanner.nextInt();
           }
           int target = scanner.nextInt();
           Arrays.sort(arr);
           for (int i = 0; i < N - 2; i++) {
               int left = i + 1;
               int right = N - 1;
               while (left < right) {
                   int sum = arr[i] + arr[left] + arr[right];
                   if (sum == target) {
                       System.out.println(arr[i] + ", " + arr[left] + " and " + arr[right]);
                       left++;
                       right--;
                       while (left < right && arr[left] == arr[left - 1]) {
                           left++;
                       }
                       while (left < right && arr[right] == arr[right + 1]) {
                           right--;
                       }
                   } else if (sum < target) {
                       left++;
                   } else {
                       right--;
                   }
               }
               while (i < N - 2 && arr[i] == arr[i + 1]) {
                   i++;
               }
           }

           scanner.close();
       }
   }

*/
//import java.util.*;
//public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        int t = Sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == t) {
                    System.out.println(arr[i] + ", " + arr[left] + " and " + arr[right]);
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                } else if (sum < t) {
                    left++;
                } else {
                    right--;
                }
                while (i < n - 2 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
            Sc.close();
        }
    }
}