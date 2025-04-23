import java.util.Scanner;
import java.util.Arrays;

public class c294 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] side = new int[3];

        for (int i = 0; i < 3; i++) {
            side[i] = scanner.nextInt();
        }

        Arrays.sort(side);

        if (side[0] + side[1] > side[2]) {
            int aa_plus_bb = side[0] * side[0] + side[1] * side[1];
            int cc = side[2] * side[2];

            System.out.println(side[0] + " " + side[1] + " " + side[2]);
            if (aa_plus_bb == cc) {
                System.out.println("Right");
            } else if (aa_plus_bb > cc) {
                System.out.println("Acute");
            } else {
                System.out.println("Obtuse");
            }
        } else {
            System.out.println(side[0] + " " + side[1] + " " + side[2]);
            System.out.println("No");
        }

        scanner.close();
    }
}
