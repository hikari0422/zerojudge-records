import java.util.Scanner;

public class j909 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();

        System.out.println(lastName + ", " + firstName);

        scanner.close();
    }
}
