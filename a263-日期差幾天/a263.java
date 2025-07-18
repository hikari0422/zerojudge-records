import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class a263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int y1 = scanner.nextInt();
            int m1 = scanner.nextInt();
            int d1 = scanner.nextInt();

            int y2 = scanner.nextInt();
            int m2 = scanner.nextInt();
            int d2 = scanner.nextInt();

            LocalDate date1 = LocalDate.of(y1, m1, d1);
            LocalDate date2 = LocalDate.of(y2, m2, d2);

            long diff = Math.abs(ChronoUnit.DAYS.between(date1, date2));
            System.out.println(diff);
        }
        scanner.close();
    }
}
