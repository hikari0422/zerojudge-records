import java.util.Scanner;

public class a111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) { 
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println((n * (n + 1) * (2 * n + 1)) / 6);
        }
        scanner.close();
    }
}
