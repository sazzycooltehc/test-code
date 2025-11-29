
import java.util.Scanner;

public class Calculator {

    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return Math.abs(a - b);
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        System.out.println("Select your divisor: " + a + " or " + b);
        try (Scanner sc = new Scanner(System.in)) {
            float divisor = sc.nextFloat();

            if (divisor == 0) {
                System.err.println("Cannot divide by zero!");
            }

            float q = (divisor == a) ? b / a : a / b;
            return q;
        }
    }

}
