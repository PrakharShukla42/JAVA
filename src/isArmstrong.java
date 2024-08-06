import java.util.*;
public class isArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}