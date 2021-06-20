import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y;
        System.out.println("Введите число x: ");
        x = scan.nextDouble();
        System.out.println("Введите число y: ");
        y = scan.nextDouble();
        System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’: ");
        String operation =  scan.next();
        double result;
        if (y == 0 & operation.equals("/")) {
            System.out.println("Деление на 0 запрещено");
        } else {
        switch (operation) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                System.out.println("Выбран некорректный символ");
                return;
        }
                System.out.println("Результат: " + result);
        }
    }
}
