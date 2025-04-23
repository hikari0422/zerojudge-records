package d010;

import java.util.Scanner;
import java.util.ArrayList;

public class d010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            ArrayList<Integer> number = new ArrayList<>();

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    number.add(i);
                }
            }

            int sum = 0;
            for (int i = 0; i < number.size(); i++) {
                sum += number.get(i);
            }

            if (n < sum) {
                System.out.println("盈數");
            } else if (n > sum) {
                System.out.println("虧數");
            } else {
                System.out.println("完全數");
            }
        }

        scanner.close();
    }
}
