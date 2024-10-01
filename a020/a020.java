package a020;

import java.util.Scanner;

public class a020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id = scanner.nextLine();

        char city = id.charAt(0);
        String number = id.substring(1);

        if (city >= 65 && city <= 72) {
            city -= 55;
        } else if (city == 'I') {
            city -= 39;
        } else if (city >= 74 && city <= 78) {
            city -= 56;
        } else if (city == 'O') {
            city -= 44;
        } else if (city >= 80 && city <= 86) {
            city -= 57;
        } else if (city == 'W') {
            city -= 55;
        } else if (city == 'X' || city == 'Y') {
            city -= 58;
        } else if (city == 'Z') {
            city -= 57;
        }

        int sum = city / 10  + (city % 10) * 9;

        for (int i = 0; i < 8; i++) {
            sum += (number.charAt(i) - 48) * (8 - i);
        }

        sum += number.charAt(8) - 48;

        if (sum % 10 == 0) {
            System.out.println("real");
        } else {
            System.out.println("fake");
        }

        scanner.close();
    }
}