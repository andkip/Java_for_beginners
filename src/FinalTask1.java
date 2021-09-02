import java.util.Scanner;

/**
 * Задание: Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей.
 * Итоговое значение должно быть округлено до двух знаков после запятой.
 */
public class FinalTask1 {
    public static void main(String[] args) {
        float rub, rate;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара:");
        rate = scan.nextFloat();
        System.out.println("Введите количество рублей:");
        rub = scan.nextFloat();
        System.out.println("Курс доллара: " + rate);
        System.out.println("Количество рублей: " + rub);
        System.out.printf("Итого: %.2f долларов", rub/rate);
    }
}
