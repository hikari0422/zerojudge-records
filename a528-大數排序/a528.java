import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class a528 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            ArrayList<BigInteger> numList = new ArrayList<>();
            int number = scanner.nextInt();

            for (int i = 0; i < number; i++) {
                BigInteger bigNum = scanner.nextBigInteger();
                numList.add(bigNum);
            }

            Collections.sort(numList);

            for (BigInteger j : numList) {
                System.out.println(j);
            }
        }

        scanner.close();
    }
}