package SectionAA;
import java.util.*;
public class Array3 {
	public static void main(String[] args) {
	    {
	        int arr[] = new int[] {1,2,3,4,5,6,7};
	        int n = arr.length;
	        int k = 3;
	        k = k % n;
	        for (int i=n-k,j=n-1;i<j;i++,j--) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	        for (int i=0,j=n-k-1;i<j; i++,j--) {
	            int newone = arr[i];
	            arr[i] = arr[j];
	            arr[j] = newone;
	        }
	        for (int i = 0,j=n-1;i<j;i++,j--) {
	            int cout = arr[i];
	            arr[i] = arr[j];
	            arr[j] = cout;
	        }
	        for (int t = 0; t < n; t++) {
	            System.out.print(arr[t] + " ");
	        }
	    }
	}
}
