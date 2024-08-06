package SectionAA;
import java.util.Scanner;
public class DTB{
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number : ");
		        int n=scanner.nextInt();
		        int ans = 0;
		        int mul = 1;
		        while(n>0) {
		        	int rem=n%2;
		        	ans+=rem+mul;
		        	mul*=10;
		        	n/=2;
		        }
		        System.out.println(ans);
		    }
}

