import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
       // bubblesort(arr);
        selectionsort(arr);
    }
    public static void selectionsort(int[] arr) {
        for (int i=0;i<arr.length; i++) {
            int key=i;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[key]) {
                    key=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[key];
            arr[key]=temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}