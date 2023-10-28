import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создание объекта ввода числа из консоли
        Scanner scan = new Scanner(System.in);

        // Декларация переменных
        int start;
        int step;
        int count;
        int sum = 0;

        // Инициализация переменных путём ввода через клавиатуру
        System.out.println("Enter the starting element, step and number of members (by a space)");
        start = scan.nextInt();
        step = scan.nextInt();
        count = scan.nextInt();

        // Подсчёт суммы арифметической прогрессии
        for (int i = 0; i < count; i++) {
            sum += start + step * i;
        }

        // Вывод суммы арифметической прогрессии
        System.out.println("The sum of the arithmetic progression: " + sum);
    }
}