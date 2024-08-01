import java.util.Scanner;

public class d649 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("_");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("+");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}