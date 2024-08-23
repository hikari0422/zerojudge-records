import java.util.Scanner;

public class f351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String output = input.replaceAll("\\s+", " ");
        System.out.println(output);

        scanner.close();
    }
}