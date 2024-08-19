import java.util.Scanner;

public class c648 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String[] first = {"庚","辛","壬","癸","甲","乙","丙","丁","戊","己"};
        final String[] last = {"申","酉","戌","亥","子","丑","寅","卯","辰","巳","午","未"};

        while (scanner.hasNextInt()) {
            int year = scanner.nextInt();

            System.out.println(first[year % 10] + last[year % 12]);
        }

        scanner.close();
    }
}