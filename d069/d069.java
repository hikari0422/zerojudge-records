import java.util.Scanner;

public class d069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            int year = scanner.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("a leap year");
            } else {
                System.out.println("a normal year");
            }
        }
    
        scanner.close();
    }
}