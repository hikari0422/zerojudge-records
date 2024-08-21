import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class a263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String date1Str = scanner.nextLine();
        
        String date2Str = scanner.nextLine();
        
        try {
            // 解析日期
            LocalDate date1 = parseDate(date1Str);
            LocalDate date2 = parseDate(date2Str);
            
            // 計算差異並取絕對值
            int daysBetween = Math.abs(Period.between(date1, date2).getDays());
            System.out.println(daysBetween);
        } catch (Exception e) {
            System.out.println("輸入錯誤：" + e.getMessage());
        }

        scanner.close();
    }

    // 自訂的日期解析方法
    private static LocalDate parseDate(String dateStr) {
        String[] parts = dateStr.split(" ");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return LocalDate.of(year, month, day);
    }
}
