import java.util.Scanner;

public class c760 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        String[] names = input.split(" ");
        
        for (String name : names) {
            String capitalized = Character.toUpperCase(name.charAt(0)) + name.substring(1);
            System.out.println(capitalized);
        }

        scanner.close();
    }
}
