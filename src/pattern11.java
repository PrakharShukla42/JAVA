package SectionAA;
import java.util.*;
public class pattern11 {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int N = scanner.nextInt();
		        
		        if (N % 2 == 0 || N <= 0 || N >= 10) {
		            System.out.println("Invalid input");
		            return;
		        }
		        
		        for (int i = 1; i <= N; i++) {
		            for (int j = 1; j <= N; j++) {
		                if (i == 1 || i == N || j == 1 || j == N || i == j || j == N - i + 1) {
		                    System.out.print("*\t");
		                } else {
		                    System.out.print("\t");
		                }
		            }
		            System.out.println();
		        }
		    }
	}
