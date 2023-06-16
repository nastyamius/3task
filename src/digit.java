import java.util.Scanner;
import java.util.ArrayList;

public class digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();
        System.out.print("Цифры в числе " + number + ": ");
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (number != 0) {
            int digit = number % 10;
            digits.add(digit);
            number /= 10;
        }
        for (int i = digits.size() - 1; i >= 0; i--) {
            System.out.print(digits.get(i) + " ");
        }
    }
}