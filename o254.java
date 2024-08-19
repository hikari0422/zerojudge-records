import java.util.Scanner;

public class o254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A < B || A == B) {
            System.out.println(B + 1);
        } else {
            System.out.println(A);
        }

        scanner.close();
    }
}