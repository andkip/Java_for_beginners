import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y, z;
        System.out.println("Введите число x: ");
        x = scan.nextDouble();
        System.out.println("Введите число y: ");
        y = scan.nextDouble();
        System.out.println("Введите число z: ");
        z = scan.nextDouble();
        double result = (x + y + z) / 3;
        System.out.println("Среднее арифметическое чисел x, y, z: " + result);
        double finalResult =  Math.floor(result / 2);
        if (finalResult > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}