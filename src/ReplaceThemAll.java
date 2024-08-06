import java.util.*;
public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        String nStr = Long.toString(n);
        String replacedStr = nStr.replace('0', '5');
        long result = Long.parseLong(replacedStr);
        System.out.println(result);
    }
}
