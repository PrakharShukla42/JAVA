import java.util.Scanner;
public class ChewbaccaNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        scanner.close();
        String xStr = Long.toString(x);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < xStr.length(); i++) {
            int digit = Character.getNumericValue(xStr.charAt(i));
            if (i == 0 && digit == 9) {
                result.append(digit);
            } else {
                int invertedDigit = Math.min(digit, 9 - digit);
                result.append(invertedDigit);
            }
        }
        System.out.println(result.toString());
    }
}
