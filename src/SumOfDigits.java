import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        int number, sumOfDigits = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = scanner.nextInt();

        while (number != 0) {
            sumOfDigits += number % 10;
            number = number / 10;
        }

        System.out.print("Sum of Digits: " + sumOfDigits);
    }
}
