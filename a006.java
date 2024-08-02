import java.util.Scanner;

public class a006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("No real root");
        }

        
    }
}