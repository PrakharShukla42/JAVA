public class PrintSortedtotarget {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2, 6};
        int t = 7;
        int min = 1;
        System.out.println(t);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == t) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }
}
