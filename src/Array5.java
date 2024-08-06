package SectionAA;

import java.util.Arrays;

public class Array5 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int k=k%arr.length;
		//int k = 3;
		swap(arr,0,arr.length-1);
		swap(arr,0,k-1);
		swap(arr,k,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	private static void swap(int [] arr,int start, int end) {
		while(start<end) {
			int t = arr[start];
			arr[start]=arr[end];
			arr[end]=t;
			start++;
			end--;
		}
	}

}
