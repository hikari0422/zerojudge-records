import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class a248 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            BigDecimal bigA = new BigDecimal(a);
            BigDecimal bigB = new BigDecimal(b);

            BigDecimal ans1 = bigA.divide(bigB, n + 5, RoundingMode.HALF_UP);

            BigDecimal ans2 = ans1.setScale(n, RoundingMode.DOWN);

            System.out.println(ans2);
        }

        scanner.close();
    }
}
