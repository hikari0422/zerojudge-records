import java.util.Scanner;

public class a216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long n = scanner.nextLong();
            System.out.println(n*(n+1)/2 + " " + n*(n+1)*((n+2)/6) + "\n");
        }
        scanner.close();
    }
}