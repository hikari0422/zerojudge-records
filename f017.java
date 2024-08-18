import java.util.Scanner;

public class f017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char text = word.charAt(i);
            
            if (i < word.length() - 1) {
                System.out.print(text + "-");
            } else {
                System.out.print(text);
            }
        }

        scanner.close();
    }
}
