import java.util.Scanner;
public class Inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to be reversed :- ");
        int N = scanner.nextInt();
        scanner.close();

        int reverse = 0;
        while (N != 0) {
            int digit = N % 10;
            reverse = reverse * 10 + digit;
            N /= 10;
        }
        System.out.println(reverse);
    }
}