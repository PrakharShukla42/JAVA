package SectionAA;

public class Array2 {
	public static void main(String[] args) {
		int arr[] = {2,3,4,7,9,1,2};
        /*int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element of given array: " + max);*/
		int item = 2;
		int last = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==item) {
				last=i;
			}
		}
		System.out.println(last);
    }  
} 

