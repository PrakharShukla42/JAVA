import java.util.*;
public class SubArrays {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int maxsum = 0;
        for (int i = 0;i < arr.length;i++){
            for (int j = i;j < arr.length; j++){
                int sum=0;
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    maxsum=Math.max(maxsum,sum)
;                    sum=sum+arr[k];
                }
                //System.out.println();
                System.out.println("="+sum);
            }
        }
        System.out.println(maxsum);
    }
}
