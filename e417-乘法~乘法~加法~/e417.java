import java.util.Scanner;

public class e417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();

            long num1 = 0, num2 = 0;

            for (int i = 0; i < a; i++) {
                int x = scanner.nextInt();
                num1 += x;
                num2 += (long) x * x;
            }

            long ans = (num1 * num1 - num2) / 2;
            System.out.println(ans);
        }

        scanner.close();
    }
}