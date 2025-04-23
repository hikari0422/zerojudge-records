import java.util.Scanner;

public class a006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        String[] number = input.split(" ");

        int a = Integer.parseInt(number[0]);
        int b = Integer.parseInt(number[1]);
        int c = Integer.parseInt(number[2]);

        int d = b * b - 4 * a * c;

        if (d > 0) {
            int root1 = (int) ((-b + Math.sqrt(d)) / (2 * a));
            int root2 = (int) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("Two different roots x1=" + root1 + " , x2=" + root2);
        } else if (d == 0) {
            int root = (int) ((-b + Math.sqrt(d)) / (2 * a));
            System.out.println("Two same roots x=" + root);
        } else {
            System.out.println("No real root");
        }

        scanner.close();
    }
}