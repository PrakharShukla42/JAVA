import java.util.*;
public class ImverseOfArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i= 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int newArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            if(i == arr[i]){
                newArr[i] = arr[i];
            }
            else{
                newArr[arr[i]] = i;
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}