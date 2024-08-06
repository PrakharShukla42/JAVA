import java.util.*;
public class InversingQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        NatureAndRoots(a, b, c);
        scanner.close();
    }
    public static void NatureAndRoots(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("Real and Distinct");
            int root1 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
            int root2 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
            System.out.println(Math.min(root1, root2) + " " + Math.max(root1, root2));
        } else if (discriminant == 0) {
            System.out.println("Real and Equal");
            int root = (int) (-b / (2 * a));
            System.out.println(root + " " + root);
        } else {
            System.out.println("Imaginary");
        }
    }
}