import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        // bubblesort(arr);
        //selectionsort(arr);
        insertionsort(arr);
    }
    public static void insertionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j=i-1;
            // for (int j = i + 1; j < arr.length; j++) {
            while (j>=0 && key < arr[i]){
                arr[j + 1] = arr[i];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}