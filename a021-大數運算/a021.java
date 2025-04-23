import java.util.Scanner;
import java.math.BigInteger;

public class a021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        BigInteger a = new BigInteger(parts[0]);
        String o = parts[1];
        BigInteger b = new BigInteger(parts[2]);

        if (o.equals("+")) {
            System.out.println(a.add(b));
        } else if (o.equals("-")) {
            System.out.println(a.subtract(b));
        } else if (o.equals("*")) {
            System.out.println(a.multiply(b));
        } else if (o.equals("/")) {
            System.out.println(a.divide(b));
        }

        scanner.close();
    }
}
