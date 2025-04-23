import java.util.Scanner;

public class d066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        String[] number = input.split(" ");
        String times = number[0] + number[1];
        
        int time = Integer.parseInt(times);

        if (time >= 730 && time < 1700) {
            System.out.println("At School");
        } else {
            System.out.println("Off School");
        }
        
        scanner.close();
    }
}
