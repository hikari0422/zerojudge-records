import java.util.Scanner;

public class a010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        boolean first = true;

        for (int i = 2; i <= input; i++) {
            if (input % i == 0) {
                int num = 0;

                while (input % i == 0) {
                    input /= i;
                    num++;
                }

                if (!first) {
                    System.out.print(" * ");
                }
                first = false;

                if (num == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + "^" + num);
                }
            }
        }
        scanner.close();
    }
}