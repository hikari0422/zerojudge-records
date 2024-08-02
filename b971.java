import java.util.Scanner;

public class b971 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();

        if (step > 0) {
            for (int i = start; i <= end; i += step) {
                if (i != start) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
        } else if (step < 0) {
            for (int i = start; i >= end; i += step) {
                if (i != start) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
        } else {
            System.out.print(start);
        }

        System.out.println();
        scanner.close();
    }
}
