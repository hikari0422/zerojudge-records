import java.util.Scanner;

public class a058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = 0, b = 0, c = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            switch (num % 3) {
                case 0: a++; break;
                case 1: b++; break;
                case 2: c++; break;
            }
        }
        System.out.println(a + " " + b + " " + c);

        scanner.close();
    }
}