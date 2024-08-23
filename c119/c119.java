import java.math.BigInteger;
import java.util.Scanner;

public class c119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            BigInteger factorial = BigInteger.ONE;

            for (int i = number; i >= 1; i--) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            String factorialStr = factorial.toString();
            int sum = 0;

            for (int i = 0; i < factorialStr.length(); i++) {
                sum += Character.getNumericValue(factorialStr.charAt(i));
            }

            System.out.println(sum);
        }
        scanner.close();
    }
}
