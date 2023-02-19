import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int count = 0;
        while (num2 != 0) {
            int num3 = scanner.nextInt();
            if( num2 > 0 && num3 < 0) {
                count++;
            }
            num2 = num3;
        }
        System.out.println(count);
    }
}