import java.util.Scanner;

public class a215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum = a;
            int i = 0;
            for (i = 1; sum <= b; i++) {
                sum += a + i;
            }

            System.out.println(i);
        }

        scanner.close();
    }
}