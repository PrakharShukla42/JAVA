import java.util.*;
public class NonRepeatingCharacter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt();
                scanner.nextLine();
                String input = scanner.nextLine();
                char result = findFirstNonRepeatingCharacter(input);
                if (result == '\0') {
                    System.out.println("-1");
                } else {
                    System.out.println(result);
                }
            }
        }
        public static char findFirstNonRepeatingCharacter(String input) {
            int[] count = new int[256];
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                count[c]++;
            }
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (count[c] == 1) {
                    return c;
                }
            }
            return '\0';
        }
    }

