
import java.util.Scanner;

public class Test {

    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static int addNumbers(int n, int m) {
        return (m + n);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers");

            int q = sc.nextInt();
            int x = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter the option:");

            String ch = sc.nextLine().trim().toLowerCase();

            switch (ch) {
                case "add" -> {
                    float ll = Calculator.add(q, x);
                    System.out.println(ll);
                }
                default ->
                    throw new AssertionError("Unknown option: " + ch);
            }
        }
    }

}
