import java.util.*;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.next();
        scanner.close();int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char digit = binaryString.charAt(i);int power = binaryString.length() - 1 - i;
            int digitValue = Character.getNumericValue(digit);
            decimal += digitValue * Math.pow(2, power);
        }

        System.out.println(decimal);
    }
}

