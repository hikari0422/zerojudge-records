import java.math.BigInteger;
import java.util.Scanner;

public class c120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("1");
                continue;
            }

            BigInteger num = BigInteger.ONE;
            for (int i = number; i >= 1; i--) {
                num = num.multiply(BigInteger.valueOf(i));
            }
            System.out.println(number + "!");
            System.out.println(num);
        }

        scanner.close();
    }
}
