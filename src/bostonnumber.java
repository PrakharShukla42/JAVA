import java.util.Scanner;
public class bostonnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        int sumOfDigits = calculateSumOfDigits(N);
        int sumOfPrimeFactors = calculateSumOfPrimeFactors(N);
        if (sumOfDigits == sumOfPrimeFactors) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    private static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    private static int calculateSumOfPrimeFactors(int number) {
        int sum = 0;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                sum += calculateSumOfDigits(i);
                number /= i;
            }
        }
        return sum;
    }
}
