import java.util.Scanner;

public class a135 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int count = 1;
        while (scanner.hasNext()) {
            String word = scanner.nextLine();
            if (word.equals("#")) {
                break;
            }
            switch (word) {
                case "HELLO":
                    System.out.println("Case " + count + ": ENGLISH");
                    break;
                case "HOLA":
                    System.out.println("Case " + count + ": SPANISH");
                    break;
                case "HALLO":
                    System.out.println("Case " + count + ": GERMAN");
                    break;
                case "BONJOUR":
                    System.out.println("Case " + count + ": FRENCH");
                    break;
                case "CIAO":
                    System.out.println("Case " + count + ": ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("Case " + count + ": RUSSIAN");
                    break;
                default:
                    System.out.println("Case " + count + ": UNKNOWN");
            }
            count++;
        }
        scanner.close();
    }
}