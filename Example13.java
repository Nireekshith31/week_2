import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("The sum of digits in the given number is " + sum);
    }
}