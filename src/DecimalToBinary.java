package SectionAA;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int deci=scanner.nextInt();
		String binary=Integer.toBinaryString(deci);
		System.out.println("Binary is "+binary);
	}
}
