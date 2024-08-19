import java.util.Scanner;

public class a149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); 
        
        for (int i = 0; i < T; i++) {
            String number = scanner.next();
            
            int product = 1;
            
            for (char digitChar : number.toCharArray()) {
                int digit = Character.getNumericValue(digitChar); 
                product *= digit; 
            }
            
            System.out.println(product);
        }
        
        scanner.close();
    }
}
