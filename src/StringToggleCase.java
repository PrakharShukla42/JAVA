import java.util.*;
public class StringToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                str += Character.toLowerCase(s.charAt(i));
            } else {
                str += Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.print(str);
    }
}