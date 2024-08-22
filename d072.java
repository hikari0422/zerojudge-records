import java.util.Scanner;

public class d072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int year = scanner.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Case " + i + ": a leap year");
            } else {
                System.out.println("Case " + i + ": a normal year");
            }
        }

        scanner.close();
    }
}
