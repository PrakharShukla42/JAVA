package SectionAA;
import java.util.*;
public class Array1 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		int brr[]={10,20,30,40};
		
		System.out.println(arr[0]+" "+brr[0]);
		swap(arr,brr);
		System.out.println(arr[0]+" "+brr[0]);
	}
	private static void swap(int []arr,int []brr) {
		int t = arr[0];
		arr[0] = brr[0];
		brr[0] = t;
	}
}
