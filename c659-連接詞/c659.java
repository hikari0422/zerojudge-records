package c659;

import java.util.Scanner;

public class c659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.nextLine();

        String n = b.trim().replace(" ", " " + a + " ");
        System.out.println(n);

        scanner.close();
    }
}
