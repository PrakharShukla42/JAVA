package SectionAA;
import java.util.Scanner;
public class Fabonnaci {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number : ");
	        int n=scanner.nextInt();
	        int a=0,x=1;
	        System.out.println("Fibonacci sequence:");
	        if (n>=1) {
	            System.out.print(a+" ");
	        }
	        if (n>=2) {
	            System.out.print(x+" ");
	        }
	        for (int i=3;i<=n;i++) {
	            int y = a+x;
	            System.out.print(y+" ");
	            //y=a+x;
	            a=x;
	            x=y;
	        }
	        scanner.close();
	    }
	    
}
