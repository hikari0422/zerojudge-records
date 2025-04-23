import java.util.Scanner;

public class g496 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b % a == 0) {
            System.out.println(b / a);
        } else if (b % a != 0) {
            System.out.println(b / a + 1);
        }

        scanner.close();
    }
}
