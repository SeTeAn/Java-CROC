import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создание объекта ввода числа из консоли
        Scanner scan = new Scanner(System.in);

        // Декларация переменной
        int number;

        // Инициализация переменной путём ввода через консоль
        System.out.println("Enter the number. This number must be greater than 1.");
        number = scan.nextInt();

        // Ветвление возможных результатов
        if (is_prime(number)) {
            if (is_prime(number - 2)) {
                System.out.printf("Number %d is a prime number, and is a also a twin number to prime number %d\n",
                        number, number - 2);
            } else System.out.printf("Number %d is a prime number", number);
        } else System.out.printf("Number %d isn't a prime number", number);
    }


    // Метод, проверяющий, является ли число простым
    static boolean is_prime(int number) {
        if (number <= 1) {
            return false;
        }
        int div = 2;
        while ((div * div) < number) {
            if (number % div == 0) {
                return false;
            }
            div += 1;
        }
        return true;
    }
}